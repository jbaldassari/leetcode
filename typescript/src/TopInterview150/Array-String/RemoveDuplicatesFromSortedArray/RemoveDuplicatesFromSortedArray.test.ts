import {removeDuplicates} from './RemoveDuplicatesFromSortedArray';

describe('Remove Duplicates from Sorted Array', () => {
  it('example 1', () => {
    evaluate([1, 1, 2], 2, [1, 2]);
  });
  it('example 2', () => {
    evaluate([0, 0, 1, 1, 1, 2, 2, 3, 3, 4], 5, [0, 1, 2, 3, 4]);
  });
  it('array of size 1: no removals', () => {
    evaluate([1], 1, [1]);
  });
  it('array of size 2: all duplicates', () => {
    evaluate([1, 1], 1, [1]);
  });
  it('array of size 2: no duplicates', () => {
    evaluate([1, 2], 2, [1, 2]);
  });
  it('array of size 3: all duplicates', () => {
    evaluate([1, 1, 1], 1, [1]);
  });
  it('array of size 3: dupes at beginning', () => {
    evaluate([0, 0, 1], 2, [0, 1]);
  });
  it('array of size 3: dupes at end', () => {
    evaluate([0, 1, 1], 2, [0, 1]);
  });
  it('array of size 4: dupes in middle', () => {
    evaluate([0, 1, 1, 2], 3, [0, 1, 2]);
  });
});

function evaluate(nums: number[], expectedOutput: number, expectedNums: number[]): void {
  const numsCopy = [...nums];
  const output = removeDuplicates(numsCopy);
  expect(output).toBe(expectedOutput);
  expect(numsCopy.slice(0, output)).toStrictEqual(expectedNums);
}

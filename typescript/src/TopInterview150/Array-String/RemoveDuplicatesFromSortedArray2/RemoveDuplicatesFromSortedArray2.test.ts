import {removeDuplicates} from './RemoveDuplicatesFromSortedArray2';

describe('Remove Duplicates from Sorted Array 2', () => {
  it('example 1', () => {
    evaluate([1, 1, 1, 2, 2, 3], 5, [1, 1, 2, 2, 3]);
  });
  it('example 2', () => {
    evaluate([0, 0, 1, 1, 1, 1, 2, 3, 3], 7, [0, 0, 1, 1, 2, 3, 3]);
  });
  it('exmaple 3', () => {
    evaluate([1, 1, 1, 2, 2, 2, 3, 3], 6, [1, 1, 2, 2, 3, 3]);
  });
  it('array of size 1', () => {
    evaluate([1], 1, [1]);
  });
  it('array of size 2: all duplicates', () => {
    evaluate([1, 1], 2, [1, 1]);
  });
  it('array of size 2: no duplicates', () => {
    evaluate([1, 2], 2, [1, 2]);
  });
  it('array of size 3: no duplicates', () => {
    evaluate([1, 2, 3], 3, [1, 2, 3]);
  });
  it('array of size 3: all duplicates', () => {
    evaluate([1, 1, 1], 2, [1, 1]);
  });
  it('array of size 3: first 2 duplicates', () => {
    evaluate([1, 1, 2], 3, [1, 1, 2]);
  });
  it('array of size 4: no duplicates', () => {
    evaluate([0, 1, 2, 3], 4, [0, 1, 2, 3]);
  });
  it('array of size 4: dupes at beginning', () => {
    evaluate([0, 0, 0, 1], 3, [0, 0, 1]);
  });
  it('array of size 4: dupes at end', () => {
    evaluate([0, 1, 1, 1], 3, [0, 1, 1]);
  });
  it('array of size 5: dupes in middle', () => {
    evaluate([0, 1, 1, 1, 2], 4, [0, 1, 1, 2]);
  });
  it('array of size 6: dupes in middle 1', () => {
    evaluate([0, 1, 1, 1, 1, 2], 4, [0, 1, 1, 2]);
  });
  it('array of size 6: dupes in middle 2', () => {
    evaluate([0, 1, 1, 1, 2, 3], 5, [0, 1, 1, 2, 3]);
  });
  it('array of size 7: dupes in middle', () => {
    evaluate([0, 1, 1, 1, 1, 2, 3], 5, [0, 1, 1, 2, 3]);
  });
});

function evaluate(nums: number[], expectedOutput: number, expectedNums: number[]): void {
  const numsCopy = [...nums];
  const output = removeDuplicates(numsCopy);
  expect(output).toBe(expectedOutput);
  expect(numsCopy.slice(0, output)).toStrictEqual(expectedNums);
}

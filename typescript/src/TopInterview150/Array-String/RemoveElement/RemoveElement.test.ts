import {removeElement} from './RemoveElement';

describe('Remove Element', () => {
  it('example 1', () => {
    evaluate([3, 2, 2, 3], 3, 2, [2, 2]);
  });
  it('example 2', () => {
    evaluate([0, 1, 2, 2, 3, 0, 4, 2], 2, 5, [0, 1, 4, 0, 3]);
  });
  it('empty array', () => {
    evaluate([], 0, 0, []);
  });
  it('array of size 1: no removals', () => {
    evaluate([1], 0, 1, [1]);
  });
  it('array of size 1: with removal', () => {
    evaluate([1], 1, 0, []);
  });
  it('array of size 2: remove first', () => {
    evaluate([0, 1], 0, 1, [1]);
  });
  it('array of size 2: remove last', () => {
    evaluate([0, 1], 1, 1, [0]);
  });
  it('array of size 3: remove middle', () => {
    evaluate([0, 1, 2], 1, 2, [0, 2]);
  });
});

function evaluate(nums: number[], val: number, expectedOutput: number, expectedNums: number[]): void {
  const numsCopy = [...nums];
  const output = removeElement(numsCopy, val);
  expect(output).toBe(expectedOutput);
  expect(numsCopy.slice(0, output)).toStrictEqual(expectedNums);
}

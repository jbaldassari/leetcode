import {mergeSortedArray} from './MergeSortedArray';

describe('Merge Sorted Array', () => {
  it('example 1', () => {
    evaluate([1, 2, 3, 0, 0, 0], [2, 5, 6], [1, 2, 2, 3, 5, 6]);
  });
  it('example 2', () => {
    evaluate([1], [], [1]);
  });
  it('example 3', () => {
    evaluate([0], [1], [1]);
  });
  it('example 4', () => {
    evaluate([4, 0, 0, 0, 0, 0], [1, 2, 3, 5, 6], [1, 2, 3, 4, 5, 6]);
  });
  it('all nums1 > nums2', () => {
    evaluate([4, 5, 6, 0, 0, 0], [1, 2, 3], [1, 2, 3, 4, 5, 6]);
  });
  it('all nums1 < nums2', () => {
    evaluate([1, 1, 1, 0, 0, 0], [4, 5, 6], [1, 1, 1, 4, 5, 6]);
  });
  it('nums1 longer than nums2', () => {
    evaluate([4, 5, 6, 7, 0, 0], [3, 3], [3, 3, 4, 5, 6, 7]);
  });
  it('nums1 shorter than nums2', () => {
    evaluate([4, 5, 0, 0, 0, 0], [1, 2, 3, 4], [1, 2, 3, 4, 4, 5]);
  });
  it('nums1 sorts inside nums2', () => {
    evaluate([2, 3, 4, 0, 0, 0], [1, 5, 6], [1, 2, 3, 4, 5, 6]);
  });
  it('nums2 sorts inside nums1', () => {
    evaluate([1, 5, 6, 0, 0, 0], [2, 3, 4], [1, 2, 3, 4, 5, 6]);
  });
  it('all nums1', () => {
    evaluate([1, 5, 6], [], [1, 5, 6]);
  });
  it('all nums2', () => {
    evaluate([0, 0, 0], [1, 5, 6], [1, 5, 6]);
  });
});

function evaluate(nums1: number[], nums2: number[], expected: number[]): void {
  const nums1Copy = [...nums1];
  mergeSortedArray(
    nums1Copy,
    nums1Copy.reduce((total, element) => total + (element === 0 ? 0 : 1), 0),
    nums2,
    nums2.length,
  );
  expect(nums1Copy).toStrictEqual(expected);
}

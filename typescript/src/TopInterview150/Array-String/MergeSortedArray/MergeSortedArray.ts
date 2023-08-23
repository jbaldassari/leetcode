/*
 * Strategy:
 * Work backwards from the end of each array,
 * filling in each spot in the merged array with the max value from the two arrays
 * Computation: O(n)
 * Memory: O(1)
 */

export function mergeSortedArray(nums1: number[], m: number, nums2: number[], n: number): void {
  if (n === 0) {
    // nums2 is empty - nothing to sort
    return;
  }

  let nums1Index = m - 1;
  let nums2Index = n - 1;

  const findMax: () => number = () => {
    if (nums1Index >= 0 && nums2Index >= 0) {
      return Math.max(nums1[nums1Index], nums2[nums2Index]);
    } else if (nums1Index < 0) {
      return nums2[nums2Index];
    }
    return nums1[nums1Index];
  };

  for (let resultIndex = m + n - 1; resultIndex >= 0; resultIndex--) {
    const max = findMax();
    nums1[resultIndex] = max;
    if (max === nums1[nums1Index]) {
      nums1Index--;
    } else {
      nums2Index--;
    }
  }
}

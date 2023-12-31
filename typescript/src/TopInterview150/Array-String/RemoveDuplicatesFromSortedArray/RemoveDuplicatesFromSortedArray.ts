/*
 * Strategy:
 * Iterate through the array with 2 pointers.
 *   `index`: Standard loop pointer that iterates through all elements of the array.
 *   `uniqueIndex`: Tracks the index in the array where the _next_ unique element should go.
 * Iterate through the array, skipping elements that are the same as the previous element.
 * When a unique element is found, copy it into `uniqueIndex` then increment `uniqueIndex`.
 * Computation: O(n)
 * Memory: O(1)
 */

export function removeDuplicates(nums: number[]): number {
  if (nums.length === 1) {
    return 1;
  }
  let uniqueIndex = 1;
  for (let index = 1; index < nums.length; index++) {
    if (nums[index - 1] !== nums[index]) {
      nums[uniqueIndex] = nums[index];
      uniqueIndex++;
    }
  }
  return uniqueIndex;
}

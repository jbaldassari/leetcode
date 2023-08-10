/*
 * Strategy:
 * Iterate through the array with 2 pointers.
 *   `index`: Standard loop pointer that iterates through all elements of the array.
 *   `uniqueIndex`: Tracks the index of the place in the array where the _next_ unique element should go.
 * Iterate through the array, kipping elements that are the same as the previous element.
 * When a unique element is found, copy it into `uniqueIndex` then increment `uniqueIndex`.
 */

export function removeDuplicates(nums: number[]): number {
  if (nums.length === 1) {
    return 1;
  }
  let uniqueIndex = 1;
  for (let index = 1; index < nums.length; index++) {
    if (nums[index] === nums[index - 1]) {
      continue;
    }
    nums[uniqueIndex] = nums[index];
    uniqueIndex++;
  }
  return uniqueIndex;
}

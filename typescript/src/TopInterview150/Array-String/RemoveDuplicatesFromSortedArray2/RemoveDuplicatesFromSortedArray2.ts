/*
 * Strategy:
 * Iterate through the array with 2 pointers.
 *   `index`: Standard loop pointer that iterates through all elements of the array.
 *   `uniqueIndex`: Tracks the index in the array where the current unique element is located.
 */

export function removeDuplicates(nums: number[]): number {
  if (nums.length < 3) {
    return nums.length;
  }

  let uniqueIndex = 1;
  for (let index = 2; index < nums.length; index++) {
    if (nums[uniqueIndex] !== nums[index] || nums[uniqueIndex - 1] !== nums[index]) {
      nums[++uniqueIndex] = nums[index];
    }
  }
  return uniqueIndex + 1;
}

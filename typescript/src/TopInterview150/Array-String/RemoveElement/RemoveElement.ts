export function removeElement(nums: number[], val: number): number {
  let lastIndex = nums.length - 1;
  for (let index = 0; index <= lastIndex; index++) {
    if (nums[index] === val) {
      while (nums[lastIndex] === val && lastIndex > index) {
        lastIndex--;
      }
      nums[index] = nums[lastIndex];
      nums[lastIndex] = val;
      lastIndex--;
    }
  }
  return lastIndex + 1;
}

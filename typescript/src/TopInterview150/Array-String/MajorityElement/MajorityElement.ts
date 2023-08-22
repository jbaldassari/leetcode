// Boyer-Moore majority vote algorithm
// https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
export function majorityElement(nums: number[]): number {
  return nums.reduce(
    (state, current) => {
      if (state.count === 0) {
        state.result = current;
      }
      if (current === state.result) {
        state.count++;
      } else {
        state.count--;
      }
      return state;
    },
    {count: 0, result: nums[0]},
  ).result;
}

/*
// Boring solution
export function majorityElement(nums: number[]): number {
  const counts: Map<number, number> = new Map();
  for (const num of nums) {
    const count = (counts.get(num) ?? 0) + 1;
    if (count > nums.length / 2) {
      return num;
    }
    counts.set(num, count);
  }
  throw new Error('No majority element found');
}
*/

import {majorityElement} from './MajorityElement';

describe('Majority Element', () => {
  it('example 1', () => {
    expect(majorityElement([3, 2, 3])).toBe(3);
  });
  it('example 2', () => {
    expect(majorityElement([2, 2, 1, 1, 1, 2, 2])).toBe(2);
  });
  it('length 1', () => {
    expect(majorityElement([0])).toBe(0);
  });
  it('length 2', () => {
    expect(majorityElement([0, 0])).toBe(0);
  });
  it('length 3: mode at beginning', () => {
    expect(majorityElement([0, 0, 1])).toBe(0);
  });
  it('length 3: mode at end', () => {
    expect(majorityElement([0, 1, 1])).toBe(1);
  });
  it('length 3: all same element', () => {
    expect(majorityElement([1, 1, 1])).toBe(1);
  });
  it('length 4: beginning', () => {
    expect(majorityElement([2, 2, 2, 1])).toBe(2);
  });
  it('length 4: end', () => {
    expect(majorityElement([1, 2, 2, 2])).toBe(2);
  });
  it('length 4: all same', () => {
    expect(majorityElement([3, 3, 3, 3])).toBe(3);
  });
  it('length 5', () => {
    expect(majorityElement([5, 3, 3, 1, 3])).toBe(3);
  });
  it('oops', () => {
    expect(majorityElement([4, 4, 3, 3, 4, 4, 2])).toBe(4);
  });
});

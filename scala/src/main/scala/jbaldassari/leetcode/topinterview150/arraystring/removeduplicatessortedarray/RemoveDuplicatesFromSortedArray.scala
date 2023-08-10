package jbaldassari.leetcode.topinterview150.arraystring.removeduplicatessortedarray

import scala.annotation.tailrec

/*
 * Strategy:
 * Iterate through the array with 2 pointers.
 *   `index`: Standard loop pointer that iterates through all elements of the array.
 *   `uniqueIndex`: Tracks the index of the place in the array where the _next_ unique element should go.
 * Iterate through the array, kipping elements that are the same as the previous element.
 * When a unique element is found, copy it into `uniqueIndex` then increment `uniqueIndex`.
 */

object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    @tailrec
    def removeDuplicatesTR(nums: Array[Int], index: Int = 1, uniqueIndex: Int = 1): Int = {
      if (index == nums.length) {
        return uniqueIndex;
      }
      val unique = if (nums(index) != nums(index - 1)) {
        nums(uniqueIndex) = nums(index)
        true
      } else false
      removeDuplicatesTR(nums, index + 1, if (unique) uniqueIndex + 1 else uniqueIndex)
    }
    removeDuplicatesTR(nums)
  }
}

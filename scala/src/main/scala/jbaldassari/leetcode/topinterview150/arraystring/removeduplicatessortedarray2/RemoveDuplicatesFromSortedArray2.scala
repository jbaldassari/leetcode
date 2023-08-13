package jbaldassari.leetcode.topinterview150.arraystring.removeduplicatessortedarray2

import scala.annotation.tailrec

/*
 * Strategy:
 * Iterate through the array with 2 pointers.
 *   `index`: Standard loop pointer that iterates through all elements of the array.
 *   `uniqueIndex`: Tracks the index in the array where the current unique element is located.
 */

object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length < 3) {
      return nums.length
    }

    @tailrec
    def removeDuplicatesTR(nums: Array[Int], uniqueIndex: Int = 1, index: Int = 2): Int = {
      if (index == nums.length) {
        return uniqueIndex
      }
      val updatedUniqueIndex = if (nums(uniqueIndex) != nums(index) || nums(uniqueIndex - 1) != nums(index)) {
        nums(uniqueIndex + 1) = nums(index)
        uniqueIndex + 1
      } else uniqueIndex
      removeDuplicatesTR(nums, updatedUniqueIndex, index + 1)
    }

    removeDuplicatesTR(nums) + 1
  }
}
package jbaldassari.leetcode.topinterview150.arraystring.removeelement

import scala.annotation.tailrec

/*
 * Strategy:
 * Work inward from both ends of the array,
 * skipping consecutive values that are the same
 */

object Solution {
  def removeElement(nums: Array[Int], valueToRemove: Int): Int = {
    @tailrec
    def removeElementTR(nums: Array[Int], valueToRemove: Int, startIndex: Int = 0, endIndex: Int = nums.length - 1): Int = {
      if (startIndex > endIndex) {
        return endIndex + 1
      }
      val startIndexIsValToRemove = nums(startIndex) == valueToRemove
      val endIndexIsValToRemove = nums(endIndex) == valueToRemove
      if (startIndexIsValToRemove && !endIndexIsValToRemove) {
        nums(startIndex) = nums(endIndex)
        nums(endIndex) = valueToRemove
      }
      removeElementTR(nums, valueToRemove,
        if (startIndexIsValToRemove) startIndex else startIndex + 1,
        if (endIndexIsValToRemove) endIndex - 1 else endIndex)
    }
    removeElementTR(nums, valueToRemove)
  }
}

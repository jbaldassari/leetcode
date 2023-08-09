package jbaldassari.leetcode.topinterview150.arraystring.mergesortedarray

import scala.annotation.tailrec;

/*
 * Strategy:
 * Work backwards from the end of each array,
 * filling in each spot in the merged array with the max value from the two arrays
 */

object Solution {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    if (n == 0) return

    var nums1Index = m - 1;
    var nums2Index = n - 1;

    def findMax(): Int = {
      if (nums1Index >= 0 && nums2Index >= 0) Math.max(nums1(nums1Index), nums2(nums2Index))
      else if (nums1Index < 0) nums2(nums2Index)
      else nums1(nums1Index)
    }

    @tailrec
    def mergeTR(resultIndex: Int): Unit = {
      if (resultIndex < 0) return
      val max = findMax()
      nums1(resultIndex) = max
      if ((nums1Index >= 0) && (max == nums1(nums1Index))) {
        nums1Index = nums1Index - 1
      } else {
        nums2Index = nums2Index - 1
      }
      mergeTR(resultIndex - 1)
    }

    mergeTR(m + n - 1)
  }
}
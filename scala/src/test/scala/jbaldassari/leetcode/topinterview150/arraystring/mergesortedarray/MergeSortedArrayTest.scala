package jbaldassari.leetcode.topinterview150.arraystring.mergesortedarray;

class MergeSortedArrayTest extends munit.FunSuite {
  test("example 1") {
    evaluate(Array(1, 2, 3, 0, 0, 0), Array(2, 5, 6), Array(1, 2, 2, 3, 5, 6))
  }
  test("example 2") {
    evaluate(Array(1), Array(), Array(1))
  }
  test("example 3") {
    evaluate(Array(0), Array(1), Array(1))
  }
  test("example 4") {
    evaluate(Array(4, 0, 0, 0, 0, 0), Array(1, 2, 3, 5, 6), Array(1, 2, 3, 4, 5, 6))
  }
  test("all nums1 > nums2") {
    evaluate(Array(4, 0, 0, 0, 0, 0), Array(1, 2, 3, 5, 6), Array(1, 2, 3, 4, 5, 6))
  }
  test("all nums1 < nums2") {
    evaluate(Array(1, 1, 1, 0, 0, 0), Array(4, 5, 6), Array(1, 1, 1, 4, 5, 6))
  }
  test("nums1 longer than nums2") {
    evaluate(Array(4, 5, 6, 7, 0, 0), Array(3, 3), Array(3, 3, 4, 5, 6, 7))
  }
  test("nums1 shorter than nums2") {
    evaluate(Array(4, 5, 0, 0, 0, 0), Array(1, 2, 3, 4), Array(1, 2, 3, 4, 4, 5))
  }
  test("nums1 sorts inside nums2") {
    evaluate(Array(2, 3, 4, 0, 0, 0), Array(1, 5, 6), Array(1, 2, 3, 4, 5, 6))
  }
  test("nums2 sorts inside nums1") {
    evaluate(Array(1, 5, 6, 0, 0, 0), Array(2, 3, 4), Array(1, 2, 3, 4, 5, 6))
  }
  test("all nums1") {
    evaluate(Array(1, 5, 6), Array(), Array(1, 5, 6))
  }
  test("all nums2") {
    evaluate(Array(0, 0, 0), Array(1, 5, 6), Array(1, 5, 6))
  }

  def evaluate(nums1: Array[Int], nums2: Array[Int], expected: Array[Int]): Unit = {
    val nums1Copy = nums1.clone()
    Solution.merge(nums1Copy, nums1Copy.toList.filter(number ⇒ number != 0).size, nums2, nums2.size)
    assertEquals(nums1Copy.toList, expected.toList)
  }
}

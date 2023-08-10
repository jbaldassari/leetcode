package jbaldassari.leetcode.topinterview150.arraystring.removeduplicatessortedarray

class RemoveDuplicatesFromSortedArrayTest extends munit.FunSuite {
  test("example 1") {
    evaluate(Array(1, 1, 2), 2, Array(1, 2))
  }
  test("example 2") {
    evaluate(Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4), 5, Array(0, 1, 2, 3, 4))
  }
  test("array of size 1: no removals") {
    evaluate(Array(1),  1, Array(1))
  }
  test("array of size 1: no removals") {
    evaluate(Array(1), 1, Array(1))
  }
  test("array of size 2: all duplicates") {
    evaluate(Array(1, 1), 1, Array(1))
  }
  test("array of size 2: no duplicates") {
    evaluate(Array(1, 2), 2, Array(1, 2))
  }
  test("array of size 3: all duplicates") {
    evaluate(Array(1, 1, 1), 1, Array(1))
  }
  test("array of size 3: dupes at beginning") {
    evaluate(Array(0, 0, 1), 2, Array(0, 1))
  }
  test("array of size 3: dupes at end") {
    evaluate(Array(0, 1, 1), 2, Array(0, 1))
  }
  test("array of size 4: dupes in middle") {
    evaluate(Array(0, 1, 1, 2), 3, Array(0, 1, 2))
  }
  def evaluate(nums: Array[Int], expectedOutput: Int, expectedNums: Array[Int]): Unit = {
    val numsCopy = nums.clone()
    val result = Solution.removeDuplicates(numsCopy)
    assertEquals(result, expectedOutput)
    assertEquals(numsCopy.toList.take(expectedNums.size), expectedNums.toList)
  }
}

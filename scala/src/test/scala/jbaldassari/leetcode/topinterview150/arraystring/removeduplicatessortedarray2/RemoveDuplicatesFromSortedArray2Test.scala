package jbaldassari.leetcode.topinterview150.arraystring.removeduplicatessortedarray2

class RemoveDuplicatesFromSortedArray2Test extends munit.FunSuite {
  test("example 1") {
    evaluate(Array(1, 1, 1, 2, 2, 3), 5, Array(1, 1, 2, 2, 3))
  }
  test("example 2") {
    evaluate(Array(0, 0, 1, 1, 1, 1, 2, 3, 3), 7, Array(0, 0, 1, 1, 2, 3, 3))
  }
  test("example 3") {
    evaluate(Array(1, 1, 1, 2, 2, 2, 3, 3), 6, Array(1, 1, 2, 2, 3, 3))
  }
  test("array of size 1") {
    evaluate(Array(1),  1, Array(1))
  }
  test("array of size 2: all duplicates") {
    evaluate(Array(1, 1), 2, Array(1, 1))
  }
  test("array of size 2: no duplicates") {
    evaluate(Array(1, 2), 2, Array(1, 2))
  }
  test("array of size 3: no duplicates") {
    evaluate(Array(1, 2, 3), 3, Array(1, 2, 3))
  }
  test("array of size 3: all duplicates") {
    evaluate(Array(1, 1, 1), 2, Array(1, 1))
  }
  test("array of size 3: first 2 duplicates") {
    evaluate(Array(1, 1, 2), 3, Array(1, 1, 2))
  }
  test("array of size 4: no duplicates") {
    evaluate(Array(0, 1, 2, 3), 4, Array(0, 1, 2, 3))
  }
  test("array of size 4: dupes at beginning") {
    evaluate(Array(0, 0, 0, 1), 3, Array(0, 0, 1))
  }
  test("array of size 4: dupes at end") {
    evaluate(Array(0, 1, 1, 1), 3, Array(0, 1, 1))
  }
  test("array of size 5: dupes in middle") {
    evaluate(Array(0, 1, 1, 1, 2), 4, Array(0, 1, 1, 2))
  }
  test("array of size 6: dupes in middle 1") {
    evaluate(Array(0, 1, 1, 1, 1, 2), 4, Array(0, 1, 1, 2))
  }
  test("array of size 6: dupes in middle 2") {
    evaluate(Array(0, 1, 1, 1, 2, 3), 5, Array(0, 1, 1, 2, 3))
  }
  test("array of size 7: dupes in middle") {
    evaluate(Array(0, 1, 1, 1, 1, 2, 3), 5, Array(0, 1, 1, 2, 3))
  }
  def evaluate(nums: Array[Int], expectedOutput: Int, expectedNums: Array[Int]): Unit = {
    val numsCopy = nums.clone()
    val result = Solution.removeDuplicates(numsCopy)
    assertEquals(result, expectedOutput)
    assertEquals(numsCopy.toList.take(expectedNums.size), expectedNums.toList)
  }
}

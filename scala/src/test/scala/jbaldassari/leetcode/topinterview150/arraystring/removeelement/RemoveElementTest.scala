package jbaldassari.leetcode.topinterview150.arraystring.removeelement

class RemoveElementTest extends munit.FunSuite {
  test("example 1") {
    evaluate(Array(3, 2, 2, 3), 3, 2, Array(2, 2))
  }
  test("example 2") {
    evaluate(Array(0, 1, 2, 2, 3, 0, 4, 2), 2, 5, Array(0, 1, 4, 0, 3))
  }
  test("empty array") {
    evaluate(Array(), 0, 0, Array())
  }
  test("array of size 1: no removals") {
    evaluate(Array(1), 0, 1, Array(1))
  }
  test("array of size 1: with removal") {
    evaluate(Array(1), 1, 0, Array())
  }
  test("array of size 2: remove first") {
    evaluate(Array(0, 1), 0, 1, Array(1))
  }
  test("array of size 2: remove last") {
    evaluate(Array(0, 1), 1, 1, Array(0))
  }
  test("array of size 3: remove middle") {
    evaluate(Array(0, 1, 2), 1, 2, Array(0, 2))
  }
  def evaluate(nums: Array[Int], valueToRemove: Int, expectedOutput: Int, expectedNums: Array[Int]): Unit = {
    val numsCopy = nums.clone()
    val result = Solution.removeElement(numsCopy, valueToRemove)
    assertEquals(result, expectedOutput)
    assertEquals(numsCopy.toList.take(expectedNums.size), expectedNums.toList)
  }
}

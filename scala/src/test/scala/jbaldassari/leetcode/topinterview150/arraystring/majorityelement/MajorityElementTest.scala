package jbaldassari.leetcode.topinterview150.arraystring.majorityelement

class MajorityElementTest extends munit.FunSuite {
  test("example 1") {
    assertEquals(Solution.majorityElement(Array(3, 2, 3)), 3)
  }
  test("example 2") {
    assertEquals(Solution.majorityElement(Array(2, 2, 1, 1, 1, 2, 2)), 2)
  }
  test("length 1") {
    assertEquals(Solution.majorityElement(Array(0)), 0)
  }
  test("length 2") {
    assertEquals(Solution.majorityElement(Array(0, 0)), 0)
  }
  test("length 3: majority at beginning") {
    assertEquals(Solution.majorityElement(Array(0, 0, 1)), 0)
  }
  test("length 3: majority at end") {
    assertEquals(Solution.majorityElement(Array(0, 1, 1)), 1)
  }
  test("length 3: all same element") {
    assertEquals(Solution.majorityElement(Array(1, 1, 1)), 1)
  }
  test("length 4: beginning") {
    assertEquals(Solution.majorityElement(Array(2, 2, 2, 1)), 2)
  }
  test("length 4: end") {
    assertEquals(Solution.majorityElement(Array(1, 2, 2, 2)), 2)
  }
  test("length 4: all same") {
    assertEquals(Solution.majorityElement(Array(3, 3, 3, 3)), 3)
  }
  test("length 5") {
    assertEquals(Solution.majorityElement(Array(5, 3, 3, 1, 3)), 3)
  }
  test("length 7") {
    assertEquals(Solution.majorityElement(Array(4, 4, 3, 3, 4, 4, 2)), 4)
  }
}

package jbaldassari.leetcode.topinterview150.arraystring.majorityelement

// Boyer-Moore majority vote algorithm
// https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
// Computation: O(n)
// Memory: O(1)
object Solution {
  case class BoyerMooreState(count: Int, result: Int)
  def majorityElement(nums: Array[Int]): Int =
    nums.foldLeft(BoyerMooreState(0, nums(0))) {
      (state, current) => BoyerMooreState(
        if ((state.count == 0) || (current == state.result)) state.count + 1 else state.count - 1,
        if (state.count == 0) current else state.result)
    }.result
}

/*
// Boring solution
// Computation: O(n)
// Memory: O(n/2)
object Solution {
  import scala.annotation.tailrec
  import scala.collection.immutable.Map;
  def majorityElement(nums: Array[Int]): Int = {
    @tailrec
    def majorityElementTR(remaining: List[Int], counts: Map[Int, Int] = Map()): Int = {
      def incrementCount(num: Int) = counts.getOrElse(num, 0) + 1
      remaining match {
        case head :: Nil => head
        case head :: tail => {
          val updatedCount = incrementCount(head)
          if (updatedCount > nums.length / 2) head
          else majorityElementTR(tail, counts + (head -> updatedCount))
        }
      }
    }
    majorityElementTR(List(nums:_*))
  }
}
*/
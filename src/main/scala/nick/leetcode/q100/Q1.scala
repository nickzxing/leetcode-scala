package nick.leetcode.q100

/**
  * 1. 两数之和
  * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
  * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
  * 示例:
  * 给定 nums = [2, 7, 11, 15], target = 9
  * 因为 nums[0] + nums[1] = 2 + 7 = 9
  * 所以返回 [0, 1]
  *
  * @author NickZxing
  * @date 2020/10/26 17:38
  */
object Q1 {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var map: Map[Int, Int] = Map()
    for (i <- 0 until (nums.length)) {
      val result: Int = target - nums(i);
      if (map.contains(result)) {
        return Array(map(result), i);
      }
      map += (nums(i) -> i)
    }
    return null
  }

  def main(args: Array[String]): Unit = {
    println(twoSum(Array(2, 7, 11, 15), 9).mkString("[", ", ", "]"))
  }
}

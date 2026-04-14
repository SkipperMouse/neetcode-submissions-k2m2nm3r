class Solution {
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val a = nums[i]
        if (a in map) {
            return intArrayOf(map[a]!!, i)
        }
        val b = target - a
        map[b] = i
    }
    return intArrayOf()
}
}

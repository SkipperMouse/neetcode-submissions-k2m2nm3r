class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
    val buffer = HashMap<Int, Boolean>()
    nums.forEach {
        val value = buffer.put(it, true)
        if (value == true) {
            return true
        }
    }
        return false
}
}

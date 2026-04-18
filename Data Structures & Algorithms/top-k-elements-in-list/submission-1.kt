class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = HashMap<Int, Int>()
    for(num in nums) {
        map[num] = (map[num] ?: 0) + 1
    }
    val entries = map.entries.sortedByDescending() { it.value }
    return entries
        .take(k)
        .map { it.key }
        .toIntArray()
}
}

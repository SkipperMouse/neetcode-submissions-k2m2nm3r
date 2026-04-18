class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freqMap = HashMap<Int, Int>()
    for (num in nums) {
        freqMap[num] = (freqMap[num] ?: 0) + 1
    }
    val sortedByFreq = PriorityQueue<Pair<Int, Int>>(Comparator.comparing { it.second })
    for ((num, freq) in freqMap.entries) {
        sortedByFreq.offer(num to freq)
        if (sortedByFreq.size > k) {
            sortedByFreq.poll()
        }
    }
    return sortedByFreq.map { it.first }
        .toIntArray()
}
}


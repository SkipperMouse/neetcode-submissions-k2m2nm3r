class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freqMap = HashMap<Int, Int>()
    for (num in nums) {
        freqMap[num] = (freqMap[num] ?: 0) + 1
    }
    val freqBucket = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
    freqMap.forEach { num, freq -> freqBucket[freq].add(num) }

    val result = IntArray(k)
    var processedElements = 0
    outer@ for (i in freqBucket.indices.reversed()) {
        val bucket = freqBucket[i]
        for (num in bucket) {
            result[processedElements] = num
            processedElements++
            if (processedElements == k) {
                break@outer
            }
        }
    }
    return result
}
}


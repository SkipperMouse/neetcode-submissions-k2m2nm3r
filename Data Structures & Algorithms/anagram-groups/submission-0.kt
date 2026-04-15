class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()
    for (str in strs) {
        val arr = IntArray(26)
        for (char in str) {
            arr[char - 'a' ] = arr[char - 'a'] + 1
        }
        val key  = arr.joinToString("|")
        map.getOrPut(key) { mutableListOf() }.add(str)
    }
    return map.values.toList()
}
}
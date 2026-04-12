class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val used = HashMap<Char, Int>()
        for (i in t.indices) {
            val char = t[i]
            used[char] = used.getOrDefault(char, 0) + 1
        }
        
        for (i in s.indices) {
            val char = s[i]
            val usedValue = used[char] ?: return false
            
            if (usedValue <= 0) {
                return false
            }
            
            if (usedValue == 1) {
                used.remove(char)
                continue
            }
            
            used[char] = usedValue -1 
        }
        
        return used.isEmpty()
    }
}

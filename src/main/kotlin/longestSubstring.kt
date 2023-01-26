fun main() {
    val longestSubstring = LongestSubstring()
    println(longestSubstring.lengthOfLongestSubstring("abcabcbb"))
    println(longestSubstring.lengthOfLongestSubstring("bbbbb"))
    println(longestSubstring.lengthOfLongestSubstring("pwwkew"))
    println(longestSubstring.lengthOfLongestSubstring(""))
    println(longestSubstring.lengthOfLongestSubstring(" "))
    println(longestSubstring.lengthOfLongestSubstring("dvdf"))
    println(longestSubstring.lengthOfLongestSubstring("aabbcc"))
}

class LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        println(s)
        val charArray = s.toCharArray()
        if (charArray.isNotEmpty()) {
            val listList = mutableListOf<List<Char>>()
            var list = mutableListOf<Char>()
            for (j in charArray.indices) {
                var i = j
                while (!list.contains(charArray[i]) && i + 1 < charArray.size) {
                    list.add(charArray[i])
                    //println(charArray[i])
                    i++
                }
                if (!list.contains(charArray[i])) list.add(charArray[i])
                listList.add(list)
                list = mutableListOf()
                // println(listList)
            }
            var maxEl = listList[0]
            listList.forEach {
                if (it.size > maxEl.size) maxEl = it
            }
            return maxEl.size
        } else {
            return 0
        }
    }
}


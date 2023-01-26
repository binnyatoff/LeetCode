fun sobesedSlova() {
    val listString:List<String> = listOf("abc","abc","cde", "dce","cba","www","aaa","" )
    val successList = mutableListOf<List<String>>()

    for(element in listString){
        val list = mutableListOf<String>()
        val charArray_first =  element.toCharArray()
        val symbols_first = getSymbolsMap(charArray_first)
        for(element in listString) {
            val charArray_two = element.toCharArray()
            val symbols_two = getSymbolsMap(charArray_two)
            if (symbols_first == symbols_two) {
                list.add(element)

            }
        }
        if (!successList.contains(list)){
            successList.add(list)
        }
    }
    println(successList)
}


fun getSymbolsMap(charArray:CharArray):Map<Char, Int>{
    val map: MutableMap<Char, Int> = mutableMapOf()
    charArray.forEach{char->
        if (map.containsKey(char)){
            map[char] = map[char]!! + 1
        }else{
            map[char] = 1
        }
    }
    return map
}
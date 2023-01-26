fun main() {
    val zigzagConversion = ZigzagConversion()
   zigzagConversion.convert("PAYPALISHIRING", 3)
    //Output: "PAHNAPLSIIGYIR"
    //Output: "PINALSIGYAHRPI"
}


class ZigzagConversion() {
    fun convert(s: String, numRows: Int) {
        val charList: MutableList<Char> = s.toMutableList()
        val testCharList = mutableListOf<Char>()
        val newCharList = mutableListOf<Char>()
        //if (numRows == 1)
        val up = (numRows - 1) / 2
        val down = (numRows - 1) % 2
        //testCharList.add(charList[0])
        for ((index,i) in (numRows until charList.size).withIndex()){
            if(index%(numRows+1) == 0){
                testCharList.add(' ')
                testCharList.add(charList[index])
                testCharList.add(' ')
            }else{
                testCharList.add(charList[index])
            }
        }
        println(testCharList)

/*
        charList.forEach(testCharList::add)
        for((rem, i) in (0 until charList.size step numRows+1).withIndex()){
            newCharList.add(charList[i])
            testCharList.removeAt(i - rem)
        }
       // println(charList)
       // println(testCharList)
       // println(newCharList)
       // charList.removeAll(charList)
        testCharList.forEach(charList::add)

        for((rem, i) in (0 until charList.size step numRows+1).withIndex()){
            newCharList.add(charList[i])
            testCharList.removeAt(i - rem)
        }
        //println(charList)
        //println(testCharList)
        //println(newCharList)

 */
    }
}

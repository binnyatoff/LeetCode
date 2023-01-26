fun main() {
    val stringToInt = StringToInt()
    println(stringToInt.myAtoi("   -42"))
    println(stringToInt.myAtoi("42"))
    println(stringToInt.myAtoi("-4193 with words"))
    println(stringToInt.myAtoi("words and 987"))
    println(stringToInt.myAtoi("-91283472332"))
    println(stringToInt.myAtoi("+1"))
    println(stringToInt.myAtoi("+-12"))
    println(stringToInt.myAtoi("00000-42a1234"))
    println(stringToInt.myAtoi("   +0 123"))
    println(stringToInt.myAtoi("20000000000000000000"))
}

class StringToInt {
    fun myAtoi(s: String): Int {
        var sum: Long = 0
        var newString = ""
        var filterString = ""
        var boolean = false
        //   var s = s.filter {
        //     it != ' '
        //}
        var s = s.dropWhile {
            it == ' '
        }
        val functl = { it: Char ->
            try {
                it.toString().toInt()
                true
            } catch (e: Exception) {
                false
            }
        }
        run breaking@{
            s.forEach {
                if (functl(it)) {
                    newString += it
                    filterString += it
                    boolean = true
                } else {
                    if ((it == '-' || it == '+') && !boolean) {
                        newString += it
                        filterString += it
                    } else {
                        return@breaking
                    }
                }
            }
        }
        filterString = filterString.filter {
            !(it == '+' || it == '-')
        }
        var filterNumb = filterString.toLongOrNull()
        if (filterNumb != null) {
            try {
                sum = newString.toLong()
            } catch (e: Exception) {
                newString.forEach {
                    when (it) {
                        '+' -> sum += filterNumb!!
                        '-' -> sum -= filterNumb!!
                    }
                }
            }


            return if (sum <= -2147483648) {
                -2147483648
            } else {
                if (sum >= 2147483648) {
                    2147483647
                } else {
                    sum.toInt()
                }
            }
        } else {
            return 0
        }
    }
}
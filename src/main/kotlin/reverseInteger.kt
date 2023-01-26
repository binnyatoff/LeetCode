fun main() {
    val reverseInteger = ReverseInteger()
    reverseInteger.reverse(1534236469)
}


class ReverseInteger {
    fun reverse(x: Int):Int {
            var a = 0
            if (x < 0) {
                return try {
                    a = x.toString().reversed().dropLast(1).toInt()
                    a -= a * 2
                    a
                }catch (e:Exception){
                    0
                }

            } else {
                return try {
                    x.toString().reversed().toInt()
                }catch (e:Exception){
                    0
                }
            }
    }
}
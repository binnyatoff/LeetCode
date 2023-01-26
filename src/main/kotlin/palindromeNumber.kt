fun main(){
    val palindromeNumber = PalindromeNumber()
    println( palindromeNumber.isPalindrome(-11))
    println( palindromeNumber.isPalindrome(11))
    println( palindromeNumber.isPalindrome(10))

}

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        return if (x>=0){
            val xStringReversed = x.toString().reversed()
            xStringReversed == x.toString()
        }else{
            var xStringReversed = x.toString().reversed()
            xStringReversed == x.toString()
        }
    }
}
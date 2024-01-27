package leetcode


fun main() {

     println("Output is :  ${GreatestCommonDivisorOfStrings().gcdOfStrings("ABCDEF","ABC")}")
    println("Output is :  ${GreatestCommonDivisorOfStrings().gcdOfStrings("ABCABC","ABC")}")
    println("Output is :  ${GreatestCommonDivisorOfStrings().gcdOfStrings("ABABAB","ABAB")}")
    println("Output is :  ${GreatestCommonDivisorOfStrings().gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX")}")
}

class GreatestCommonDivisorOfStrings {

    fun gcdOfStrings(str1: String, str2: String): String {

        if (str1 + str2 != str2 + str1) {
            return ""
        }

        val gcdLength = gcd(str1.length, str2.length)

        return str1.substring(0, gcdLength)
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
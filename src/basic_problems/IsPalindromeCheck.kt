package basic_problems

fun isPalindrome(s: String): Boolean {
//    // Remove spaces and convert to lowercase
    val formattedString = s.replace("\\s".toRegex(), "").toLowerCase()
//
//    // Check if the string is equal to its reverse
//    return formattedString == formattedString.reversed()

    for (i in 0 until formattedString.length / 2) {
        if (formattedString[i] != formattedString[formattedString.length - 1 - i]) {
            return false
        }
    }

    return  true;
}

fun main() {
    val word = "level"
    val result = isPalindrome(word)

    if (result) {
        println("$word is a palindrome.")
    } else {
        println("$word is not a palindrome.")
    }
}
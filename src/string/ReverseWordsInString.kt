package string


fun main() {
    println(ReverseWordsInString().reverseWords("a good   example"))

}
class ReverseWordsInString {

    /*Example 1:

    Input: s = "the sky is blue"
    Output: "blue is sky the"
    Example 2:

    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.
    Example 3:

    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/

    fun reverseWords(s: String): String {

        var i = s.length-1;
        var temp = ""
        var newString ="";

        while (i >=  0)
        {
            if (s[i] == ' ')
            {
                if (temp.isNotEmpty()) {
                    newString += temp.reversed() + " "
                }
                temp = ""
            }
            else
            {
                temp += s[i];
            }
            i--
        }
        if (temp.isNotEmpty()) {
            newString += temp.reversed()
        }
        return newString.trim().replace("\\s+", " ")

    }

}
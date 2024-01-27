
package recursionPackage

fun main() {

    var mystr="";
    var inputStr = "hello"
    println(addDollers("hello") )// Result should be h$e$l$l$o

}

fun addDollers(str:String) :String
{

    if (str.length<=1) return  str;
    return "${str[0]} $ ${addDollers(str.substring(1))}"
}
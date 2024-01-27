package stringmanipulation


fun main(args: Array<String>) {

    var myStr:String ="ad"
    var newString = ""
    var a = 0



    if (myStr.length>3)
    {
        var center = myStr.length/2;
        println(myStr.substring(center-1,center+2))
    }




//    for (item in  myStr)
//    {
//        if (item >='a' && item <='z' || item>='A' && item<='Z')
//        {
//
//            newString += item
//
//
//        }
//    }


}
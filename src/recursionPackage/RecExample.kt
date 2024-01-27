package recursionPackage


fun main() {
    var temp = 0 ;
    var temp2 = 1 ;
    var temp3 = 2 ;
  //  printHello()
   // printNo(10)





    // Normal fibonacciSeries code in kotlin

//    for (i in 2..10) {
//        temp3 = temp+temp2;
//        println(temp3)
//        temp = temp2
//        temp2 = temp3
//
//    }
}

fun printHello()
{
    println("Hello there")
    printHello()
}

fun printNo (num:Int) : Int
{
    if (num ==0)
    {
        return 0
    }
    else
    {
        println("$num")
        return  printNo(num-1)
    }
}

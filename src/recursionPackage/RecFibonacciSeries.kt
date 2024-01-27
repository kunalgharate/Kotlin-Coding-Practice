package recursionPackage


fun main() {

    //Print list of fibonacci recursively

    for (i in 2..10) {
       println( fibonacciSeries(i))
    }
}
fun fibonacciSeries (num:Int):Int
{
    if (num<=1)
    {
        return num;
    }
    else
    {
        // println(fibonacciSeries(num-1) + fibonacciSeries(num-2))
      //  println("Series values i = $num  and first no = ${num-1} second no = ${num-2}")
        return fibonacciSeries(num-1) + fibonacciSeries(num-2)
    }
}

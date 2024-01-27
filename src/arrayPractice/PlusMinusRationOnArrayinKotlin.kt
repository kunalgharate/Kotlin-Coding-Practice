package arrayPractice


fun main() {


    //  val n = readLine()!!.trim().toInt()

    //  val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()


    val arr = intArrayOf(1, 1, 0, -1, -1)
    plusMinus(arr)

}

/* array [1,1,0,-1,-1]
* 0.400000
0.400000
0.200000
* */

fun plusMinus(arr: IntArray): Unit {

    var positive = 0;
    var negative = 0;
    var zeros = 0;
    arr.forEach {
        when {
            it > 0 -> positive++
            it < 0 -> negative++
            it == 0 -> zeros++
        }
    }
    val totalLength = arr.size;
    println(String.format("%.6f", (positive / totalLength.toDouble())))
    println(String.format("%.6f", (negative / totalLength.toDouble())))
    println(String.format("%.6f", (zeros / totalLength.toDouble())))

}





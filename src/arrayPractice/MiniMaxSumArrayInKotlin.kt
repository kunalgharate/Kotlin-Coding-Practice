package arrayPractice


/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Example

The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9 = 24. The function prints

* */




fun main() {

    //miniMaxSum(intArrayOf(1,3,5,7,9))
    miniMaxSum(longArrayOf(1,2,3,4,5))
    miniMaxSum(longArrayOf(942381765,627450398,954173620,583762094,236817490))
}


fun miniMaxSum(arrays: LongArray)
{
   arrays.sort()

    var minimum : Long= 0
    var maximum:Long = 0

   arrays.forEachIndexed { index, i ->

       if (index<arrays.size-1)
       {
           minimum+=i
       }
       if (index>0)
       {
           maximum+=i
       }

   }
    println("$minimum $maximum")
}



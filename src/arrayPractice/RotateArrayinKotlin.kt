package arrayPractice


/*
* Problem: Rotate an array of n elements to the right by k steps. For example,
* with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
* How many different
*
* */

//5 6 7 0 4 0 0



fun main() {

    rotate(intArrayOf(1,2,3,4,5,6,7),3)
}


fun rotate(arrays: IntArray, k :Int)
{
    val result = IntArray(arrays.size)
    var count = 0;
    var kInt = k;

    arrays.forEachIndexed { index, i ->

        if (index > k)
        {
            result[count] = i
            count++
        }
        else
        {
            result[kInt] = arrays[index]
            kInt++
        }

    }
}



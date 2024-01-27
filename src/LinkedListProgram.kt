import java.util.*

//
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.                     
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//
//Explanation: 342 + 465 = 807.


fun main() {

    sumOftwoLinkedList(listOf(2,4,3), listOf(5,6,4))
    sumOftwoLinkedList(listOf(9,9,9,9,9,9,9), listOf(9,9,9,9))
    sumOftwoLinkedList(listOf(2,4,9), listOf(5,6,4,9))
}

fun sumOftwoLinkedList(l1: List<Int>, l2:List<Int>)
{

    val list = LinkedList<String>();

   val newL1=  l1.reversed()
    val newL2= l2.asReversed()

    var l1String = StringBuffer()
    var l2String = StringBuffer()

    newL1.forEach {
        l1String.append(it)
    }
    newL2.forEach {
        l2String.append(it)
    }
   val sum =  Integer.sum(l1String.toString().toInt(),l2String.toString().toInt())

    sum.toString().forEach {
        list.add(it.toString())
    }
    list.reverse()
    println(" ${list.toList()}")
}



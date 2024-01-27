fun main() {


    var a = 17 ;
    var temp = 0

    for (i in 2..a/2)
    {
        if(a%2 ==0)
        {
            temp++
            break;
        }

    }
    if(temp==0 && a!=1)
    {
        print("prime")
    }
    else
    {
        println("not prime")
    }
}


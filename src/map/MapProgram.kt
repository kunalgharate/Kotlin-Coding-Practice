package map


fun main() {

    val inst = MainClass2()

    inst.addCricketList();
    inst.addFootballList();

    val combinedLists = inst.cricketList.zip(inst.footballList).map {
        pair ->   listOf(pair.first ,pair.second)
    }
    println(combinedLists)


}

class MainClass2 {

    var cricketList = mutableListOf<String>()
    var footballList = mutableListOf<String>()

    fun addCricketList()
    {

        cricketList.add("Virat");
        cricketList.add("Sachin");

    }

    fun addFootballList()
    {
        footballList.add("Ronold");
        footballList.add("Messi");
    }


}
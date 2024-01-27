


fun main() {

    val inst = MainClass2()
    inst.addDatatoList();
    println(inst.list)
   var items =  inst.list.filter {
        employee -> employee.id > 1000;
    }
    print(items)
}


data class Employee(val id: Int,val name: String)

class MainClass2 {

    var list = mutableListOf<Employee>()

   fun addDatatoList()
    {
        list.add(Employee(1,"Ram"));
        list.add(Employee(1200,"Pavan"));
        list.add(Employee(1100,"Krishna"));
        list.add(Employee(12,"Vasudev"));
        list.add(Employee(12,"Lakshman"));
        list.add(Employee(1000,"Bharat"));
    }

}
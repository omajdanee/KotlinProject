
fun main(args: Array<String>) {

    var Arraylist = ArrayList<String>()  // I have created instance of ArrayList
    Arraylist.add("Otmane Majdane")
    Arraylist.add("Majdane")
    Arraylist.add("Otmane")
    Arraylist.set(1,"Majdane Othmane") // change value of the second item in arraylist

    for (item in Arraylist) {

        println(item)

    }

}
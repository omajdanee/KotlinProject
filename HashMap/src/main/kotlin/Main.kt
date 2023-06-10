fun main(args: Array<String>) {

    /**In computing, a hash table, also known as hash map, is a data structure that implements
    an associative array or dictionary. It is an abstract data type that maps keys to values. **/


    var map = HashMap <Int , String> ()
    map.put(1,"Otmane Majdane")
    map.put(2,"Majdane")
    map.put(3,"Otmane")

    // change value of any item of this

    map.put(3,"Othman")

    println(map.get(1)) //print map 1
    println(map[2]) // another method to print map
    println(map.get(3))

}
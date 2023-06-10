fun main(args: Array<String>) {

    var ArrayInt = Array<Int>(5) {0}
    //ArrayInt[2] = 40
    //ArrayInt[4] = 100 // change value of array items by index

    //fill array items

    for (index in 0..4) {
        println("Enter a number")
        ArrayInt[index] = readln().toInt()
    }

    println("List of Elements")

    for (item in ArrayInt )
        println(item)
}
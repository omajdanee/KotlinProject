
fun main() {

    for (count in  1..4)
    {
        println("For loop")
        println(count)
    }
    println("")

    // this block of code(for) is the same for (while)
    var count = 0

    while (count < 5) {
        println("While")
        count ++
        println(count)

    }
    //continue from this loop while to do while

    do {
        println("Do While Loop") // execute code then > pass to the loop
        println("count: $count")
        count ++
    }
        while (count<=10)


}
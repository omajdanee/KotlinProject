
fun main(args: Array<String>) {

    for (count in 1..10) {

            println("count : $count")
            if (count==7) {
                break // when I found the number that I'm searching for then the code stops
            }
        }
    println("")
    for (count in 1..10) {

        println("count : $count")
        if (count==7) {
            continue // continue // don't stop even you found the number
        }
    }
}

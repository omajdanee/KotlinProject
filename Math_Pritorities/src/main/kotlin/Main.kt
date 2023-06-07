

fun main() {

    /** Math Operation Priorities
     * 1- ()
     * 2- ² Power
     * 3- * , /
     * 4- + , -
     * 5- =
     * **/

    val n1 = 10
    val n2 = 20
    val n3 = 5
    var sum : Int?=null

    sum = n1 + n2 * n3 - 3
    println("sum with priorities () : $sum")

    sum = (n1 + n2) * n3 - 3
    println("sum with * priority : $sum ")

    sum = n1 + n2 / n3 - 3
    println("sum with /priority : $sum ")


}
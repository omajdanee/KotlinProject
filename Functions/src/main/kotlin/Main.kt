fun main(args: Array<String>) {

    printnum(4)
    operations(100 , 30)

}

fun printnum(number : Int) {

    println("Number IS : $number")
}

fun operations(a: Int , b:Int)
{
    var sum = a + b
    println("addition : $sum")

    var substraction = a - b
    println("substraction : $substraction")
}
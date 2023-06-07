
fun main(args: Array<String>) {

    println("Enter a Number:")
    var number = readln().toInt()


    if (number > 10 && number < 100) {

        println("Your number > 10 and <100")
    }
    else { // if the condition not correct do this block of code

        println("Number is not  > 10 and <100")
    }

}
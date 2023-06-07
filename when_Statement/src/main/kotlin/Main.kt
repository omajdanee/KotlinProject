
fun main(args: Array<String>) {

    println("Enter a Number: ")
    var number = readln().toInt()

    when(number){

        1->{
            println("You enter 1")
        }
        2->{
            println("You enter 2")
        }
        3,4,5->{
            println("You enter 3 or 4 or 5")
        }
        in 10..30->{
            println("You enter a number btw 10 and 30")
        }
        !in 40..50->{
            println("You enter a number not btw 10 and 30")
        }
        else->{
            print("out of range")
        }
    }


}
fun main(args: Array<String>) {

    println("Enter a Grade:")
    var grade = readln().toInt()

    if (grade>=90) {

        println("A")
    }
    else if (grade >=80 && grade<90)
    {
        println("B")
    }

    else if (grade >=70 && grade<80)
    {
        println("C")
    }


    else {

        println("Fail")
    }
}
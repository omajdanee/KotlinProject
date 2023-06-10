fun main(args: Array<String>) {

    var msg = "Hello Kotlin"
    println(msg)
    //print just one character from string : using index : index starts from 0
    println("Character Number 6 :"+msg[6])
    println()
    // print index using loop
    for (index in 0..msg.length -1)
    {
        println("Msg[$index]=" + msg[index])
    }
    println()

    //print string with concatenation : string + other string
    var name = "Otmane "
    var msgwelcome = name + " " + msg
    println(msgwelcome)
    println(msg.trim()) // space in the beginning & the end

}

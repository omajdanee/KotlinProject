import kotlin.reflect.typeOf

fun main(args: Array<String>) {

    var name:String = readln() //readln() used to get input from user -- accepts null values//

    var age:Int = readLine()!!.toInt() // convert anything you get from user to int and save it into age //

    var city = readLine()!! // get input from user but accepts just not null values //

    println("my name is:"+name) // +name (+) : means concatenation > my name is + name you get from user

    println("age: "+age)

    println("city: "+city)

}
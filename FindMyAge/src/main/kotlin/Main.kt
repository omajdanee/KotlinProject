import java.time.Year
import java.util.Calendar

fun main() {

    //Input from user :
    println("Enter Your Year Of Birth:")
    var YearOfBirth : Int = readln().toInt()

    //Process :
    var year = Calendar.getInstance().get(Calendar.YEAR) // function to use system date(Current Year)
    var age = year - YearOfBirth

    //Result
    println("Your Age is : $age Years Old")
}
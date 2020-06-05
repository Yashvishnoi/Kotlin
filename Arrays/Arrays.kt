import java.util.*

fun main() {
    val stringArray : Array<String> =arrayOf("Hello", "Kotlin", "Programmers")
    // stringArray: Hello  Kotlin  Programmer
    //index:         0        1        2
    println(stringArray[1])//--(i)
    stringArray[1]= "I am a Kotlin Bot"
    println(stringArray[1])
    println(stringArray.get(1))//same output as --(i)
    println(stringArray.size)
    println(Arrays.toString(stringArray))

}
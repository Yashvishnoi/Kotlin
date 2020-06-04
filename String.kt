fun main() {

    val s = "I love upes"
    val stringLength = s.length
    val stringIndex = s.get(8)
    println(stringLength)
    println("The word at the position 8 is ${s.get(8)}")
    println(s.subSequence(2,8))
}
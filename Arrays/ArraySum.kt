import java.util.*

fun main() {
    val Odd = arrayOf(1,3,5,7,9)
    val Even = arrayOf(2,4,6,8,10)
    Even[0]=Even[0]+Odd[0]
    Even[1]=Even[1]+Odd[1]
    Even[2]=Even[2]+Odd[2]
    Even[3]=Even[3]+Odd[3]
    Even[4]=Even[4]+Odd[4]
    println(Arrays.toString(Even))


}
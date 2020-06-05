/*fun main() {
    val a= 10
    val b= 3
     var maxValue : Int
    if(a>b){
        maxValue=a
        }
   else{
        maxValue=b
    }
    println(maxValue)
}*/

// We can write the below code for the same also

fun main() {
    val a = 10
    val b = 20
    var maxValue: Int = if (a>b){
        a
    } else {
        b
    }
    println(maxValue)
}
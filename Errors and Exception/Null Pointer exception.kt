fun main() {
    val nullList= listOf(1,2,3,null,4,5,null,6)
    val nullArrayList= arrayListOf("This",null,"is","a",null,"statement")
    println("The list is without null value is ${nullList.filterNotNull()}")
    println("This array list is without the null value is ${nullArrayList.filterNotNull()}")
}
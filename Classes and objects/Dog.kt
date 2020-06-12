class Dog {
    var breed = "Labrador"
    var color  = "Brown"
    var age : Int =  3
    fun eat() {
        println("${breed}s eat food")
    }
    fun bark() {
        println("${breed}s bark")
    }
}

fun main() {
    val dog1 = Dog()
    dog1.eat()
    dog1.bark()
    dog1.breed = "German Sepherds"
    dog1.age= 3
    dog1.color="Mixture of Goldish and black"
    println("The breed of dog is ${dog1.breed} , whoes color is ${dog1.color} and is ${dog1.age} years old.")
    dog1.eat()
    dog1.bark()

}
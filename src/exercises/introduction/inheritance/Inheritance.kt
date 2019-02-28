package exercises.introduction.inheritance

// Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
// Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
open class Dog {
    open fun sayHello() { println("wow wow!") }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wow wow! (with yorkshire style)")
    }
}

open class Tiger(val origin : String) {
    open fun sayRoar() {
        println("Roar i'm a furious tiger from $origin")
    }
}

class AsianTiger : Tiger("China")

fun main(args: Array<String>) {

    val regularDog : Dog = Dog()
    regularDog.sayHello()
    val yorkshire : Dog = Yorkshire()
    yorkshire.sayHello()

    val asianTiger : Tiger = AsianTiger()
    asianTiger.sayRoar()
}
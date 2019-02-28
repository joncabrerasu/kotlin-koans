package exercises.controlflow

fun checkElement(element: Any) {
    when (element) {
        1 -> println("Is a number one")
        "Hello" -> println("You say hello")
        is Number -> println("Is any number")
        is Boolean -> println("Is a Boolean value")
        else -> println("Invalid value")
    }
}

fun main(args: Array<String>) {
    checkElement(1)
    checkElement("Hello")
    checkElement(2)
    checkElement(true)
}
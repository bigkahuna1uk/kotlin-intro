package com.chriskelly.kotlincourse.functions


/**
 * ExtensionFunctions
 *
 *
 * @author bigkahuna
 * @since 12/03/2017
 */
fun String.hello() = println("Hello from String class")

fun String.toTitleCase(prefix:String = ""): String {
    return this.split(" ").joinToString(" ") { "$prefix${it.capitalize()}"  }
}

fun main(args: Array<String>) {
    "Hello".hello()
    
    println("this is a sample string to Title Case it".toTitleCase())
    
    val customer = Customer()
    customer.makePreffered()
    customer.makePreffered("Chris")
    
    val bc = BaseClass()
    bc.extension()
    
    val ic :BaseClass = InheritedClass()
    ic.extension()
    
    val ic2 = InheritedClass()
    ic2.extension()
}


class Customer {
    fun makePreffered() {  //Member function takes preference over extension if named the same
        println("Customer version")
    }
}

fun Customer.makePreffered() { //This is ignored in favour of same named member function
    println("Extended version")
}
fun Customer.makePreffered(message: String) {
    println("Extended version - ${message}")
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}


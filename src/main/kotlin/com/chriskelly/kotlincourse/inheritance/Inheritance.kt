package com.chriskelly.kotlincourse.inheritance

/**
 * Inheritance
 *
 *
 * @author bigkahuna
 * @since 04/03/2017
 */


open class Person() { // Class or method need to be open for override. Closed (final) by default
    open fun validate() {
        println("Person#validate")
    }
}

open class Customer() : Person() {

    override fun validate() {  //final prevents method from override
        println("Customer#validate")
    }
}

class SpecialCustomer : Customer() {
    override fun validate() {
        super.validate()
    }
}

data class CustomerEntity(val name:String): Person() {

    override fun toString(): String {
        return "CustomerEntity[name=$name]"
    }
}

fun main(args: Array<String>) {
    val ce = CustomerEntity("Chris")

    ce.validate()

    println("ce = ${ce}")

    val specialCustomer = SpecialCustomer()
    println("specialCustomer = ${specialCustomer}")
    specialCustomer.validate()
}

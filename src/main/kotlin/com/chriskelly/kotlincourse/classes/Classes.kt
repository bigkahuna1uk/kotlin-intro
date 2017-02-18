package com.chriskelly.kotlincourse.classes

import java.util.*

/**
 * Classes
 *
 *
 * @author bigkahuna
 * @since 18/02/2017
 */
class Customer1(val id: Int, var name: String) {
    init {
        //Do some extra processing on var
        name = name.toUpperCase()
    }

    @JvmOverloads
    constructor(email: String = "") : this(0, "") {
        //FIXME: How to make email a property?
    }
}

class Customer(val id: Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var ssn: String = ""
    set(value) {
        if(!value.startsWith("SN")) {
            throw IllegalArgumentException("Social security should start with SN")
        }

        field = value
    }
}


fun main(args: Array<String>) {
    val c = Customer1(10, "Chris")
    val c2 = Customer1("a@bc.co.uk")

    println(c.name)
    println("c = ${c}")

    val customer = Customer(10, "Chris", 1980)
    customer.ssn = "SN1234"

    println("customer.id = ${customer.id}")
    println("customer.name = ${customer.name}")
    println("customer.age = ${customer.age}")
    println("customer.ssn = ${customer.ssn}")


}
package com.chriskelly.kotlincourse.classes

import java.util.*

/**
 * Classes
 *
 *
 * @author bigkahuna
 * @since 18/02/2017
 */
class Customer1(val id: Int, var name: String, var email: String = "") {
    init {
        //Do some extra processing on var
        require(id > 0) { "id must be greater than zero" }
        name = name.toUpperCase()
        email = email.toUpperCase()
    }

    @JvmOverloads
    constructor(email: String) : this(1, "Unknown", email)
}

class Customer(val id: Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var ssn: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }

            field = value
        }

    fun asString(): String {
        return "Customer: id = $id, name=$name, age=$age, ssn=$ssn"
    }
}


fun main(args: Array<String>) {
    val c1 = Customer1(10, "Chris")
    val c2 = Customer1("a@bc.co.uk")

    println(c2.name)
    println(c2.email)

    println("c = ${c1}")

    val customer = Customer(10, "Chris", 1980)
    customer.ssn = "SN1234"

    println("customer.id = ${customer.id}")
    println("customer.name = ${customer.name}")
    println("customer.age = ${customer.age}")
    println("customer.ssn = ${customer.ssn}")

    println(customer.asString())

}
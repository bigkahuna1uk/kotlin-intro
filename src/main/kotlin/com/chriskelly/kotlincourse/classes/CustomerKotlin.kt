package com.chriskelly.kotlincourse.classes

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.assertj.core.api.Assertions.assertThat

/**
 * CustomerKotlin
 *
 *
 * @author bigkahuna
 * @since 18/02/2017
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String)
{
    override fun toString(): String {
        return "{id:\"$id\" name:\"$name\" email:\"$email\"}"
    }
}


fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(1, "Chris", "chris.kelly@ab.co.uk")
    val customer2 = CustomerKotlin(1, "Chris", "chris.kelly@ab.co.uk")
    val customer3 = CustomerKotlin(2, "Chris", "chris.kelly@ab.co.uk")
    val customerCopy = customer1.copy()

    println("customer1 = $customer1")
    println("customer2 = $customer2")
    println("customer3 = $customer3")
    println("copy1     = $customerCopy")
    println()
    println("customer1 equals customer2: ${customer1 == customer2}")
    println("customer1 equals customer3: ${customer1 == customer3}")
    println("customer1 equals customerCopy: ${customer1 == customerCopy}")
    println()
    println("customer1 identity ${System.identityHashCode(customer1)}")
    println("cust copy identity ${System.identityHashCode(customerCopy)}")

    println()
    val customerCopyWithDifferentName = customer1.copy(name = "joe.bloggs")
    println("customerCopyWithDifferentName = $customerCopyWithDifferentName")

    val mapper = ObjectMapper().registerModule(KotlinModule())
    val json = mapper
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(customerCopyWithDifferentName)
    println(json)
    val deserialized = mapper.readValue(json, CustomerKotlin::class.java)
    assertThat(deserialized).isEqualTo(customerCopyWithDifferentName)
    assertThat(deserialized).isNotSameAs(customerCopyWithDifferentName)


}
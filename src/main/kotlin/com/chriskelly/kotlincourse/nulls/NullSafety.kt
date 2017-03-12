package com.chriskelly.kotlincourse.nulls

import com.chriskelly.kotlincourse.classes.CustomerKotlin

/**
 * NullSafety
 *
 *
 * @author bigkahuna
 * @since 19/02/2017
 */
class Service {
    fun evaluate() {
        println("service#evaluate")
    }
}

class ServiceProvider {
    fun createService(): Service? {
        return null
        //return Service()
    }
}

fun main(args: Array<String>) {
    val message = "Message"

    var nullMessage : String? = null
    val inferredNull = null

    //nullMessage = "Something"
    println(nullMessage?.length)
    //println(nullMessage!!.length)

    val customer = CustomerKotlin(1, "Chris", "a@bc.co.uk")
    val length = customer.email?.length
    println("length = ${length}")
    
    val provider = ServiceProvider()
    val createService: Service? = provider.createService()
    val result = createService?.evaluate() ?: "unevaluated"
    println("result = ${result}")
    println(result.javaClass.simpleName)
    
}
package com.chriskelly.kotlincourse.interop

import com.chriskelly.kotlincourse.classes.CustomerKotlin
import com.chriskelly.kotlincourse.classes.Status

import java.io.IOException

/**
 * TalkingToKotlin

 * @author bigkahuna
 * *
 * @since 26/03/2017
 */
object TalkingToKotlin {

    @JvmStatic fun main(args: Array<String>) {
        //Parameters by default cannot be null
        val customerKotlin = CustomerKotlin(1, "Chris", "ck@kotlin.com")

        val email = customerKotlin.email  //Kotlin properties become getters

        println("customerKotlin = " + customerKotlin)
        println("email = " + email)

        //Access property as field using @JvmField
        val value = customerKotlin.someProperty

        //Access method with default parameters automatically overloaded using @JvmOverload
        customerKotlin.changeStatus(Status.Current)
        customerKotlin.changeStatus()

        //Use different method name than in Kotlin
        customerKotlin.makePreferred()

        loadStats(customerKotlin)  //Should throw IOException
    }

    fun loadStats(customerKotlin: CustomerKotlin) {
        try {
            customerKotlin.loadStats("")
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

    }
}

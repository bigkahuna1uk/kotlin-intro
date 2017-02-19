package com.chriskelly.kotlincourse.nulls

/**
 * NullSafety
 *
 *
 * @author bigkahuna
 * @since 19/02/2017
 */
fun main(args: Array<String>) {
    val message = "Message"

    var nullMessage : String? = null
    val inferredNull = null

    nullMessage = "Something"
    println(nullMessage.length)

}
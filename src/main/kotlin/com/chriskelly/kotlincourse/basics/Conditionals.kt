package com.chriskelly.kotlincourse.basics

import com.chriskelly.kotlincourse.basics.util.someUtiilty as su

/**
 * Conditionals
 *
 *
 * @author bigkahuna
 * @since 16/02/2017
 */
fun main(args: Array<String>) {
    var s = "Not Empty"

    //if/when are expressions so return values, the last value of block
    val result = if (s != "") {
        "Not empty"
        20
    } else {
        "Is empty"
    }

    val whenValue = when(result) {
        is String -> {
            println("Excellent string")
            println("Condition")
        }
        is Number -> println("Excellent number")
        else -> {
            println("Defaulted")
        }
    }

    println("whenValue=$whenValue")

    su("Chris")
}
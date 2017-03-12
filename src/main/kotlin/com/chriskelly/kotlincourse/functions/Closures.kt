package com.chriskelly.kotlincourse.functions

import com.chriskelly.kotlincourse.functional.unaryOperation

/**
 * Closures
 *
 *
 * @author bigkahuna
 * @since 12/03/2017
 */

fun outsideFunction() {
    
    for (number in 1..30) {
        //Access number outside of lambda
        unaryOperation(20, { x ->
            println(number)
            x + number
        })
    }
}

fun main(args: Array<String>) {
    outsideFunction()
}
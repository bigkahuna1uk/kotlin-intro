package com.chriskelly.kotlincourse.classes

/**
 * Objects
 *
 *
 * @author bigkahuna
 * @since 19/02/2017
 */
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)


    val localObject = object {
        val PI = 3.1415927
    }

    println(localObject.PI)
}
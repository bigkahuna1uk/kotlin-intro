package com.chriskelly.kotlincourse.tidbits

/**
 * Constants
 *
 *
 * @author bigkahuna
 * @since 04/03/2017
 */

val CopyrightAuthor = "Chris Kelly"

object Copyright {//Better to place in object rather than top level
    val author = "Chris Kelly"
}


fun main(args: Array<String>) {
    println("Copyright.author = ${Copyright.author}")
    CopyrightAuthor


    println(Copyright.javaClass.name)
}
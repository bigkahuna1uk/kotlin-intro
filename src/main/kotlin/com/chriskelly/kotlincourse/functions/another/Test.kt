package com.chriskelly.kotlincourse.functions.another

import com.chriskelly.kotlincourse.functions.hello as hello1

/**
 * Test
 *
 *
 * @author bigkahuna
 * @since 12/03/2017
 */
fun String.hello() = println("Hello from String class different package")


fun main(args: Array<String>) {
    "Hello".hello1()
    "Hello".hello()
}
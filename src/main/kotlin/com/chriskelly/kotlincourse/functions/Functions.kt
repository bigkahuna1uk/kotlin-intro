package com.chriskelly.kotlincourse.functions

import org.assertj.core.api.Assertions.assertThat

/**
 * Functions
 *
 *
 * @author bigkahuna
 * @since 16/02/2017
 */

fun hello() {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takesAString(s: String) {
    println(s)
}

//Infers type from argument if expression. If block then need to specify return type
fun sum(x: Int, y: Int, z: Int = 0) = x + y + z


fun printDetails(name: String, email: String = "", phone: String)
{
    println("""Details:
    name: $name
    email: $email
    phone: $phone""")
}

fun printStrings(vararg strings: String)
{
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) println(string)
}

fun main(args: Array<String>) {
    hello()

    val t: Nothing
    try {
        t = throwingExceptions()
        println("t = $t")
    } catch(e: Exception) {
        e.printStackTrace()
    }

    takesAString("Chris")

    val result = sum(3, 4)
    assertThat(result).isEqualTo(7)

    assertThat(sum(1,2,3)).isEqualTo(6)

    //If named parameters, order is irrelevant
    printDetails("Chris", phone =  "1111", email="a@bc.co.uk")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")

}
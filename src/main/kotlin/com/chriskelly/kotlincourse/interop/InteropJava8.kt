package com.chriskelly.kotlincourse.interop

import java.util.stream.Collectors


/**
 * InteropJava8
 *
 *
 * @author bigkahuna
 * @since 19/02/2017
 */

 // some quite more verbose way to say 'listOf<String>().flatMap { it.asIterable() }'
private val chars = listOf("abc", "def").stream()
        .flatMap { it.chars().boxed().map(Int::toChar) }
        .collect(Collectors.toList<Char>())


fun printChars(chars: List<Char>) {
    println(chars)

    val findFirst = chars.stream().findFirst()
    println("Found first=${findFirst.orElse('?')}")

}

fun main(args: Array<String>) {
    printChars(chars)
}



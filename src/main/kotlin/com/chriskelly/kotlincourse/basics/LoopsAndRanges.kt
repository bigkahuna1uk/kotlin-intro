package com.chriskelly.kotlincourse.basics

/**
 * LoopsAndRanges
 *
 *
 * @author bigkahuna
 * @since 16/02/2017
 */

fun main(args: Array<String>) {
    for (a: Int in 1..100) {
        println(a)
    }

    //Type inference
    for (a in 1..100 step 10) {
        println(a)
    }

    val numbers = 1..100
    println(numbers)
    println(numbers.javaClass)

    for (a in 100 downTo 1) {
        println(a)
    }

    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    //This works
    for (a in 100 downTo 1) println(a)
    //FIXME: But this doesn't for some reason
    for (b in (100..1)) println(b)

    val capitals = listOf("Paris", "London", "Madrid", "Berlin")
    for (capital in capitals) {
        println(capital)
    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                println("($i,$j)")
                break@loop
            }
        }
    }
}
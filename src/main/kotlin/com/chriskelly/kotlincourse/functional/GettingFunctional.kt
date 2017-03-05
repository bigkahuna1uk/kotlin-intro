package com.chriskelly.kotlincourse.functional

/**
 * GettingFunctional
 *
 *
 * @author bigkahuna
 * @since 05/03/2017
 */
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Int) : Int {
   return op(x)
}

fun route(path:String,  vararg actions: (String,String) -> String) {
}

fun sum(x: Int, y: Int) = x + y

fun <T> identity(x: T): T = x

fun main(args: Array<String>) {
    val result = operation(2, 3, ::sum)
    println("result = ${result}")
    
    println(operation(1, ::identity))
}
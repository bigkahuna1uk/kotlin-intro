package com.chriskelly.kotlincourse.tidbits

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.net.URL

/**
 * NotANumberException
 *
 *
 * @author bigkahuna
 * @since 04/03/2017
 */
class NotANumberException(message: String) : Throwable(message)  //message passed to ctor of Throwable that take String


fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("Nan")
    }
}

fun main(args: Array<String>) {
    try {
        checkIsNumber("A")
    } catch(e: IllegalArgumentException) {
        println("Illegal argument")
    } catch(e: NotANumberException) {
        println("${e.message}")
    }
    
    val buffer = BufferedReader(FileReader(path("/input.txt")))
    //NB. Kotlin has extension method on File to all read lines from file
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 30)  //Should blow up as reading 40 chars into array that can only hold 30

        String(chars) //As with if/when, last line of expression returns a value
    } catch (e: IndexOutOfBoundsException) {
        println("e = ${e}")
        -1
    } finally {
        println("Closing buffer")
        buffer.close()
    }

    println("result = ${result}")
    
    path2("/input-long.txt")
}


fun path(resource: String): File {

    val foundResource: URL = NotANumberException::class.java.getResource(resource)

    println("resource = ${foundResource}")

    return File(foundResource?.toURI())
}

fun path2(resource:String) : Unit {
    val foundResource: URL = NotANumberException::class.java.getResource(resource)
    
    val file = File(foundResource?.toURI())
    var i = 0
    file.useLines { it -> it.iterator().forEach { s -> println("${i++}\t" + s) } }
    
}


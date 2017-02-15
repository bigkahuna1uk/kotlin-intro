package com.chriskelly.kotlincourse.basics

/**
 * Variables
 *
 *
 * @author bigkahuna
 * @since 15/02/2017
 */
fun main(args: Array<String>) {
    var streetNumber: Int //Vars are mutable
    var streetName = "Main Street"  //Type inference

    streetName = "Changed Street"

    val zip = "SW12 7TY" //Vals are Immutable

    val myInt = 10
    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    //No implicit conversions. Have to use an appropriate extension method
    val myLongAgain: Long = myInt.toLong()

    //Strings
    val myChar = 'A'
    val myString = "My String"
    val escapeCharacters = "A new line \n"
    val multiLine = """
        This is  string
        And another line
"""
    //Interpolation
    val years = 10
    val message = "A decade is $years years"

    val name  = "Mary"
    val anotherMessage = "Length of name $name is ${name.length}"

    println(anotherMessage)

}
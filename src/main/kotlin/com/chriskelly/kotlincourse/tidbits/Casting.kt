package com.chriskelly.kotlincourse.tidbits

/**
 * Casting
 *
 *
 * @author bigkahuna
 * @since 19/02/2017
 */
open class Person {

}

class Employee: Person() {
    fun vacationDays(days:Int) {
        if(days<60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}

var input: Any = 10

fun hasVacations(obj: Person) {
    if(obj is Employee) {
        //Smart cast to Employee
        obj.vacationDays(20)
    }
}

fun main(args: Array<String>) {

    val str = input as? String
    println(str?.let { it::class.java })
    println(str?.length)
}
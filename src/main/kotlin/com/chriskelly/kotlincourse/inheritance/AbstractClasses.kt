package com.chriskelly.kotlincourse.inheritance

/**
 * AbstractClasses
 *
 *
 * @author bigkahuna
 * @since 04/03/2017
 */
abstract class StoredEntity {

    val isActive = true

    fun status(): String {
        return isActive.toString()
    }

    abstract fun store()
}

class Employee : StoredEntity() {
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


fun main(args: Array<String>) {
    val se = Employee()

    println("se = ${se}")
    println(se.isActive)
}
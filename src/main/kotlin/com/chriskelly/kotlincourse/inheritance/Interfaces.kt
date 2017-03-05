package com.chriskelly.kotlincourse.inheritance


interface Interface1 {
    fun funA() {
        println("funA : Interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("funA : Interface 2")
    }
}

class Class1And2 : Interface1, Interface2 {
    override fun funA() {
        super<Interface2>.funA()
    }
}

fun main(args: Array<String>) {
    val class1And2 = Class1And2()
    class1And2.funA()
}
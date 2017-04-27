package com.chriskelly.kotlincourse.stdlib

/**
 * LazyEvaluations
 *
 *
 * @author bigkahuna
 * @since 27/04/2017
 */
fun main(args: Array<String>) {
    
    val elements = 1 .. 100000000000000000
    
    //Eager
    //val output = elements.filter { it < 30 }.map {Pair("Yes", it)}
    
    //Lazy using asSequence
//    val lazyOutput = elements.asSequence()
//            .filter { it < 30 }
//            .map {Pair("Yes", it)}
    
    val lazyOutput = elements.asSequence().take(30)  //Stop after first n elements
    
    
    lazyOutput.forEach {
        println(it)
    }
    
    println("sum = ${lazyOutput.sum()}")
    
    val numbers = generateSequence(1) {x -> x + 10}
    
    val sequence = numbers.take(30)
    
    println("sequence sum = ${sequence.sum()}")
    
    //Only evaluate when lazy is first called - lazy is a delegate (property delegation)
    //Can use different modes fore lazy see LazyThreadSafetyMode
    val lazyInit: Int by lazy(LazyThreadSafetyMode.PUBLICATION) {1 * 10 * 50}
    
    println("lazyInit = ${lazyInit}")
}
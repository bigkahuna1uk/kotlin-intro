package com.chriskelly.kotlincourse.stdlib

import com.google.common.collect.Lists

/**
 * WorkingWithCollections
 *
 *
 * @author bigkahuna
 * @since 21/04/2017
 */
fun main(args: Array<String>) {
    var list: List<String> = Lists.newArrayList()
    
    var emptyList = emptyList<Integer>()
    val listOf = listOf(1, 2, 3, 4)
    val cities = listOf("Madrid", "London", "Paris")
    
    println(cities.javaClass)   //java.util.ArrayList
    println(emptyList<String>().javaClass) //kotlin.collections.Empty
    
    val linkedMapOf = linkedMapOf<Int, String>(1 to "Madrid", 2 to "London", 3 to "Paris")
    println("linkedMapOf = ${linkedMapOf}")
    println("linkedMapOf.javaClass = ${linkedMapOf.javaClass}") //LinkedHashMap
    
    
    var mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")
    println("mutableCities = ${mutableCities}")
    println("mutableCities.javaClass = ${mutableCities.javaClass}")
    
    
    val list3 = listOf.toMutableList()
    list3.add(5)  //Not really persistent as copies all elements to new list before add
    println("listOf = ${listOf}")
    println("list3 = ${list3}")
    
    
    val booleans = booleanArrayOf(true, false, true)
    val chars = charArrayOf('A', 'B')
    
}
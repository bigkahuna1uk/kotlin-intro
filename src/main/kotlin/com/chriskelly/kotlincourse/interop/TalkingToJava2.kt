package com.chriskelly.kotlincourse.interop

import com.chriskelly.kotlincourse.classes.CustomerJava

/**
 * TalkingToJava
 *
 *
 * @author bigkahuna
 * @since 26/03/2017
 */
fun main(args: Array<String>) {
    
    val customerJava =  CustomerJava(1, "Chris-Java", "chris.java@jkotlin.com");
    
    println("customerJava = ${customerJava}")
    
    val email = customerJava?.email
    
    println("email = ${email}")
   
    //Platform types no equivalent in Kotlin
    customerJava.sometimesNull()   // sometimesNull()!
    
    customerJava.neverNull()       // neverNull  note no bang as marked with @NotNull
}


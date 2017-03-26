package com.chriskelly.kotlincourse.interop

import com.chriskelly.kotlincourse.classes.CustomerJava
import com.chriskelly.kotlincourse.classes.PersonJava
import java.util.concurrent.Callable

/**
 * TalkingToJava
 *
 *
 * @author bigkahuna
 * @since 26/03/2017
 */
fun main(args: Array<String>) {
    val customer = CustomerJava(1, "Chris-Java", "chris.java@jkotlin.com");
    
    println("customer = ${customer}")
    
    val email = customer.email  //Property access
    
    
    customer.prettyPrint()  //Returns Unit instead of void
    
    //Inherit from Java class
    val person = PersonKotlin(1)
    println("person = ${person}")
    
    val repo = KotlinCustomerRepository()
    val superclass = repo.javaClass.superclass
    
    println("repo = ${repo} has superclass ${superclass}")
    
    val runnable = Runnable { println("Invoking runnable") }
    
    val callable = Callable { return@Callable "Result from callable" }
    
    val result = callable.call()
    println("result = ${result}")
    
}

class PersonKotlin(id: Int) : PersonJava(id)

class KotlinCustomerRepository : ICustomerRepository   //Implement interface from Java
{
    override fun getById(id: Int): CustomerJava? {  //May return null hence ?
        TODO("not implemented")
    }
    
    override fun getAll(): MutableList<CustomerJava>? {
        TODO("not implemented")
    }
}

//SAM
class KotlinRunnable : Runnable {
    override fun run() {
        TODO("not implemented")
    }
    
}
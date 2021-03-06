package com.chriskelly.kotlincourse.inheritance

/**
 * Interfaces
 *
 *
 * @author bigkahuna
 * @since 04/03/2017
 */
interface CustomerRepository {
    
    val isEmpty: Boolean  //Can have properties but have a value but can setters/getters
        get() = true
    
    fun store(customer: Customer) { //Default implementation like Java 8.  Interfaces though cannot maintain state unlike abstract classes
        TODO("Not yet implemented")
    }
    
    fun getById(id: Int): Customer
}

class SQLCustomerRepository : CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }
    
    override fun store(customer: Customer) {
        TODO("NYI")
    }
    
    override val isEmpty: Boolean
        get() = false
}
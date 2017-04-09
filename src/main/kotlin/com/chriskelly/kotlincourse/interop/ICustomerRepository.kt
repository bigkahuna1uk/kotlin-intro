package com.chriskelly.kotlincourse.interop

import com.chriskelly.kotlincourse.classes.CustomerJava

/**
 * ICustomerRepository

 * @author bigkahuna
 * *
 * @since 26/03/2017
 */
interface ICustomerRepository {

    fun getById(id: Int): CustomerJava

    val all : List<CustomerJava>
}

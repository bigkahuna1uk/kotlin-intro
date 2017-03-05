package com.chriskelly.kotlincourse.inheritance

/**
 * Generics
 *
 *
 * @author bigkahuna
 * @since 05/03/2017
 */
interface Repository<T> {
    fun getById(id: Int) :T
    fun getAll(): List<T>
}

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented")
    }
    
    override fun getAll(): List<T> {
        return listOf()
    }
    
}


//Or generic interface with type set on the function
interface Repo
{
    fun <T> getById(id: Int): T
    fun<T> getAll() : List<T>
}

class MyRepo:  Repo{
    override fun <T> getById(id: Int): T {
        TODO("not implemented")
    }
    
    override fun <T> getAll(): List<T> {
        TODO("not implemented")
    }
}

fun main(args: Array<String>) {
    
    val customerRepo = GenericRepository<Customer>()
    
    val all = customerRepo.getAll()
    
    println("all = ${all}")
}


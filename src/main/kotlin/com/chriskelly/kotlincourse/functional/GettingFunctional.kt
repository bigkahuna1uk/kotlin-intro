package com.chriskelly.kotlincourse.functional

import com.chriskelly.kotlincourse.functional.Examples.identity

/**
 * GettingFunctional
 *
 *
 * @author bigkahuna
 * @since 05/03/2017
 */
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun <T> operationT(x: T, op: (T) -> T): T {
    return op(x)
}


fun route(path: String, vararg actions: (String, String) -> String) {
    for (action in actions) {
        action(path, ",")
    }
}

fun sum(x: Int, y: Int) = x + y

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun unaryOp(op: (Int) -> Int) {
    
}

fun transaction(db: Database, log: Logger, code: () -> Unit) {
    try {
        code()
        log.info("Code run complete")
    } finally {
        db.commit()
        log.info("Code committed to database")
    }
}

class Database {
    fun commit() {}
}

class Logger() {
    fun info(msg: String) {
        println(msg)
    }
}

fun main(args: Array<String>) {
    val result = operation(2, 3, ::sum)
    println("result = ${result}")
    
    println(operation(1, ::identity))
    
    println(operationT("Chris Kelly woz ere", ::identity))
    
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    val resultWithLambda = operation(2, 3, sumLambda)
    println("resultWithLambda = ${resultWithLambda}")
    
    unaryOperation(2, { x -> x * x })
    
    //If single parameter can use 'it'
    unaryOperation(2, { it * it })
    
    //If last/only parameter is function then can be expressed differently. Useful for DSLs
    unaryOperation(2) { it * it }
    
    unaryOp {
        // Looks like a keyword
        it * it
    }
    
    val db = Database()
    val logger = Logger()
    
    transaction(db, logger) {
        //Interact with database, logger etc
    }
    
    //Anonymous function - can have multiple return points unlike lambdas
    unaryOperation(3, fun(x: Int): Int { return x * x })
    
}
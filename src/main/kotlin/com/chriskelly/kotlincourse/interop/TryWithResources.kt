package com.chriskelly.kotlincourse.interop

import kotlinx.support.jdk7.use

/**
 * TryWithResources
 *
 *
 * @author bigkahuna
 * @since 12/03/2017
 */
class ResourceHolder : AutoCloseable {
    val resources = arrayListOf<AutoCloseable>()
    
    fun <T : AutoCloseable> T.autoClose(): T {
        resources.add(this)
        return this
    }
    
    override fun close() {
        resources.asReversed().forEach {it.close()}
    }
}

fun <R> using(block: ResourceHolder.() -> R): R {
    val holder = ResourceHolder()
    holder.use { holder ->
        return holder.block()
    }
}

fun <R> usingWithTryFinally(block: ResourceHolder.() -> R): R {
    val holder = ResourceHolder()
    try {
        return holder.block()
    } finally {
        holder.close()
    }
}

inline fun <T,R> use(t: T,  onExit:T.() -> Unit, block: (T) -> R): R {
    try {
        return block(t);
    } finally {
        t.onExit()
    }
}

fun main(args: Array<String>) {
    using {  }
    
    usingWithTryFinally {  }
}
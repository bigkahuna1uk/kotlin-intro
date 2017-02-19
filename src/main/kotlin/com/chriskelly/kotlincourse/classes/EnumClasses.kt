package com.chriskelly.kotlincourse.classes

/**
 * EnumClasses
 *
 *
 * @author bigkahuna
 * @since 19/02/2017
 */
enum class Priority(val value: Int) {
    MINOR(1) {
        override fun text(): String {
            return "[Minor Priority]"
        }

        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            return "[Normal Priority]"
        }
    },
    MAJOR(5) {
        override fun text(): String {
            return "[Major Priority]"
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            return "[Critical Priority - Captain, she's gonna blow]"
        }
    };

    override fun toString(): String {
        return text()
    }

    abstract fun text(): String

}

fun main(args: Array<String>) {
    for (p in Priority.values()) {
        println(p)
    }
}
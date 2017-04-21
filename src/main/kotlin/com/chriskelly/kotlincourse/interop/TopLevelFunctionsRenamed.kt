@file:JvmName("UtilityClass") //Renamed name of class that will be seen from Java call
package com.chriskelly.kotlincourse.interop

/**
 * TopLevelFunctions
 *
 *
 * @author bigkahuna
 * @since 09/04/2017
 */

const val CopyrightYear = 2017

fun prefix2(prefix:String, value:String) :String {
    return "$prefix-$value"
}
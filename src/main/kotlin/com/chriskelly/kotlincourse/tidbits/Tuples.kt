package com.chriskelly.kotlincourse.tidbits

import com.chriskelly.kotlincourse.classes.CustomerKotlin

/**
 * Tuples
 *
 *
 * @author bigkahuna
 * @since 19/02/2017
 */
fun capitalAndPopulation(country: String): Pair<String, Long>
{
    return Pair("Madrid", 23_000_000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 23_000_000)
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Spain")

    println("Tuple")
    println(result.first)
    println(result.second)

    val result2 = countryInformation("Spain")
    println("Triple")
    println(result2.first)
    println(result2.second)
    println(result2.third)

    val(capital, population) = capitalAndPopulation("Spain")

    println("capital = ${capital}")
    println("population = ${population}")


    val (capital2, continent2, population2) = countryInformation("Spain")
    println("capital2 = ${capital2}")
    println("continent2 = ${continent2}")
    println("population2 = ${population2}")

    println(countryInformation("Spain"))

    //Deconstruct ctor
    val customerKotlin = CustomerKotlin(1, "Chris", "Kelly")
    val(id, name) = customerKotlin
    println("customerKotlin = ${customerKotlin}")
    println("name = ${name}")

    val listCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")
    for ((capital, country) in listCapitalsAndCountries)
    {
        println("capital = ${capital}")
        println("country = ${country}")
    }

}



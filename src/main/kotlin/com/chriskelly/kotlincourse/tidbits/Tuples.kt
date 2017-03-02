package com.chriskelly.kotlincourse.tidbits

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

}



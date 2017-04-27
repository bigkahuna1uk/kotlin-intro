package com.chriskelly.kotlincourse.stdlib

import com.google.common.base.MoreObjects
import java.io.File

/**
 * LetWithApply
 *
 * <a href="http://beust.com/weblog/2015/10/30/exploring-the-kotlin-standard-library/"/>
 *
 * @author bigkahuna
 * @since 27/04/2017
 */

class Config(var buildType: String, var version: String) {
    override fun toString(): String {
        return MoreObjects.toStringHelper(this)
                .add("buildType", buildType)
                .add("version", version)
                .toString()
    }
}

fun main(args: Array<String>) {
    
    val file = File("filename.txt")
    
    with(file) {
        setReadOnly()
        setExecutable(true)
        val absoluteFile = absoluteFile
        val totalSpace = totalSpace
        
        println("absoluteFile = ${absoluteFile}")
        println("totalSpace = ${totalSpace}")
    }
    
    val id= "1"
    val map: Map<String, Config> = hashMapOf(id to Config("Unknown", "0.0.1-SNAPSHOT"))
    
    println("Before = ${map}")
    
    //Long winded
    /*
    fun configurationFor(id: String) = map[id]?.let { config ->
        config.apply {
            buildType = "DEBUG"
            version = "1.2"
        }
    }*/
    
    fun configurationFor(id:String) =map[id]?.apply {
        buildType = "DEBUG"
        version = "1.2"
    }
    
    configurationFor(id)
    val unknownConfig = configurationFor("-1")
    println("After = ${map}")
    println("unknownConfig = ${unknownConfig}")
    
    val string :String? = "Some String"
    
    val length = string?.let {
        it.length
    }
    
    println("length = ${length}")
    
    println("string.javaClass = ${string?.javaClass}")
    
}




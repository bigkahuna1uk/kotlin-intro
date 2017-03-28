package com.chriskelly.kotlincourse.interop;

import com.chriskelly.kotlincourse.classes.CustomerKotlin;
import com.chriskelly.kotlincourse.classes.Status;

import java.io.IOException;

/**
 * TalkingToKotlin
 *
 * @author bigkahuna
 * @since 26/03/2017
 */
public class TalkingToKotlin {

    public static void main(String[] args) {
        //Parameters by default cannot be null
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Chris", "ck@kotlin.com");

        String email = customerKotlin.getEmail();  //Kotlin properties become getters

        System.out.println("customerKotlin = " + customerKotlin);
        System.out.println("email = " + email);

        //Access property as field using @JvmField
        String value = customerKotlin.someProperty;

        //Access method with default parameters automatically overloaded using @JvmOverload
        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus();

        //Use different method name than in Kotlin
        customerKotlin.preferential();

        loadStats(customerKotlin);  //Should throw IOException
    }

    public static void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStats("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

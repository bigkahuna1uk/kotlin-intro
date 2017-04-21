package com.chriskelly.kotlincourse.interop;

import com.chriskelly.kotlincourse.classes.CustomerKotlin;

/**
 * TalkingToKotlin2
 *
 * @author bigkahuna
 * @since 09/04/2017
 */
public class TalkingToKotlin2 {
    public static void main(String[] args) {
        String prefix = TopLevelFunctionsKt.prefix("Big", "Kahuna");
        System.out.println("prefix = " + prefix);

        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Joe", "joe.bloggs@email.com");

        //Using a different method name then specified in Kotlin.  i.e. makePreffered->preferential
        customerKotlin.preferential();

        System.out.println("customerKotlin = " + customerKotlin);

        String prefix2 = UtilityClass.prefix2("Big", "Kahuna");
        System.out.println("prefix2 = " + prefix2);

        int copyrightYear = UtilityClass.CopyrightYear;
        System.out.println("copyrightYear = " + copyrightYear);
    }
}

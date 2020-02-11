package com.elementary_tasks.fifth;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class NumberFormatting {

    protected boolean success;
    protected String answer;

    String formatting() {

        while (!success) {

            System.out.println("Enter an integer ranging from" +
                    " -9223372036854775808 to 9223372036854775807");
            Scanner scan = new Scanner(System.in);
            try {
                long number = scan.nextLong();
                scan.close();
                RuleBasedNumberFormat converting = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                        RuleBasedNumberFormat.SPELLOUT);
                answer = converting.format(number);
                success = true;
            } catch (InputMismatchException e) {
                System.out.println("Only integers are allowed");
            }
        }
        return answer;
    }
}

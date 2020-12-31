package com.falmeida.tech;

import java.util.regex.Pattern;

public class RegexSample {

    public static void main(String[] args) {
        String text    =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern. http://lll";

        String regex = ".*http://.*";

        boolean matches = Pattern.matches(regex, text);

        System.out.println("matches = " + matches);

    }

}

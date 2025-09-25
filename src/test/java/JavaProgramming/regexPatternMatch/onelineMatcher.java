package JavaProgramming.regexPatternMatch;

import java.util.regex.Pattern;

public class onelineMatcher {
    public static void main(String[] args) {

        String input = "Java is fun";
        System.out.println(Pattern.compile("Java").matcher(input).find());
    }

}

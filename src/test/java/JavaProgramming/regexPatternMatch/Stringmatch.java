package JavaProgramming.regexPatternMatch;

import java.util.regex.Pattern;

public class Stringmatch {
    public static void main(String[] args) {

        String input = "Java is fun";
        Pattern pattern = Pattern.compile("Java");
        System.out.println(pattern.matcher(input).find());
    }
}

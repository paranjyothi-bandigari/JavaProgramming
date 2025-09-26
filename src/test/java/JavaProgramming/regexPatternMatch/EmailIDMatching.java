package JavaProgramming.regexPatternMatch;

import java.util.regex.Pattern;

public class EmailIDMatching {
    public static void main(String[] args) {
        //System.out.println(isPresent("test@example.com","^[\\w.-]+@[\\w.-]+\\.[a-z]{2,4}$"));

        System.out.println(isPresent("test@example.com","^[\\w.]+@[\\w.]+\\.[a-z]{2,4}$"));
    }
    public static boolean isPresent(String input, String output){
        return Pattern.compile(output).matcher(input).find();
    }
}

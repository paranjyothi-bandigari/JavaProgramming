package JavaProgramming.regexPatternMatch;

import java.util.regex.Pattern;

public class StringContainDigit {
    public static void main(String[] args) {
        System.out.println(isPresent("my phone number is 546578",".*\\d+.*"));
    }
    public static boolean isPresent(String input, String search){
        return Pattern.compile(search).matcher(input).find();
    }
}

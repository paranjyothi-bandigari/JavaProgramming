package JavaProgramming.regexPatternMatch;

import java.util.regex.Pattern;

public class RegexwithMethod {
    public static void main(String[] args) {
        System.out.println(isPresent("Java is fun","is"));
    }
    public static boolean isPresent(String input,String search){
        return Pattern.compile(search).matcher(input).find();
    }
}

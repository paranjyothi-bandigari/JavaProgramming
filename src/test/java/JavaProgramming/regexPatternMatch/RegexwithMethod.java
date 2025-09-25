package JavaProgramming.regexPatternMatch;

import java.util.regex.Pattern;

public class RegexwithMethod {
    public static void main(String[] args) {
        System.out.println(isPresent("Java is fun","is"));
        System.out.println(isPresent("Java is fun","^Java")); //starts with java
        System.out.println(isPresent("Java is fun","fun$")); // ends with fun
        System.out.println(isPresent("Java is fun","i?")); // o or 1 character
        System.out.println(isPresent("Java is fun","i+")); // 1 or more
        System.out.println(isPresent("Java is fun","J*")); // 0 or more
        System.out.println(isPresent("Java is fun","fu.")); //any 1 character
        //System.out.println(isPresent("Java is fun","\s"));




    }
    public static boolean isPresent(String input,String search){
        return Pattern.compile(search).matcher(input).find();
    }
}

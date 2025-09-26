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
        System.out.println(isPresent("J2","J\\d")); //\d any digit
        System.out.println(isPresent("gJ4 ","[a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("ogJ4 ","[aeiou][a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("AOgJ4 z","^A[AEIOUaeiou][a-z][A-Z]\\d\\sz$"));


    }
    public static boolean isPresent(String input,String search){
        return Pattern.compile(search).matcher(input).find();
    }
}

package Java_Practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myRegexPatternMatching {
    public static void main(String[] args) {
        String input="Java is a Fun";
        System.out.println(isPresent(input,"Fun"));
        System.out.println(isPresent(input,"Fu."));
        System.out.println(isPresent(input,"i*"));
        System.out.println(isPresent(input,"a+"));
        System.out.println(isPresent(input,"Fu?"));
        System.out.println(isPresent(input,"Fun$"));
        System.out.println(isPresent(input,"^Java"));
        System.out.println(isPresent("J2","J\\d"));
        System.out.println(isPresent("J2 ","\\w\\d\\s"));
        System.out.println(isPresent("J2 ","[A-Z]\\d\\s"));
        System.out.println(isPresent("gJ4 ","[a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("ogJ4 ","[aeiou][a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("OgJ4 ","[AEIOUaeiou][a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("AOgJ4 ","^A[AEIOU][a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("AOgJ4 Z","[AEIOU][a-z][A-Z]\\d\\sZ$"));
        System.out.println(isPresent("AOgJ4 @TRZ","[AEIOU][a-z][A-Z]\\d\\s[@][A-Z]{2,4}$"));
        System.out.println(isPresent("AOgJ4 @@@@@TRZ","[AEIOU][a-z][A-Z]\\d\\s@+[A-Z]{2,4}$"));

        System.out.println("*****************");

        System.out.println(isPresent("My phone number is 476",".*\\d+.*"));
        System.out.println(isPresent("test@example.com",""));
//        Pattern pattern= Pattern.compile("java");
//        Matcher matcher=pattern.matcher(input);
//        System.out.println(matcher.find());
        //System.out.println(Pattern.compile("Java").matcher(input).find());

    }
    public static boolean isPresent(String input,String search){
       return Pattern.compile(search).matcher(input).find();
    }
}

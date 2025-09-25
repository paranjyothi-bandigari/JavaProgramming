package JavaProgramming.regexPatternMatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternMatch {
    public static void main(String[] args) {

        String input="Java is fun";
        Pattern pattern= Pattern.compile("Java");
        Matcher matcher=pattern.matcher(input);
        boolean matchFound=matcher.find();
        System.out.println(matchFound);

    }
}

package Java_Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myRegexPatternMatching {
    public static void main(String[] args) {
        String input="Java is a Fun";
        System.out.println(isPresent(input,"Fun"));
        System.out.println(isPresent(input,"Fu.")); //. is any character
        System.out.println(isPresent(input,"i*")); // 0 or more
        System.out.println(isPresent(input,"a+")); // 1 or more
        System.out.println(isPresent(input,"Fu?")); // 0 or 1
        System.out.println(isPresent(input,"Fun$")); //$ ends
        System.out.println(isPresent(input,"^Java")); //^ starts
        System.out.println(isPresent("J2","J\\d")); //\\d for digit
        System.out.println(isPresent("J2 ","\\w\\d\\s")); //\\w any word character \\s for space
        System.out.println(isPresent("J2 ","[A-Z]\\d\\s")); // [A-Z] for any character in between A to Z
        System.out.println(isPresent("gJ4 ","[a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("ogJ4 ","[aeiou][a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("OgJ4 ","[AEIOUaeiou][a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("AOgJ4 ","^A[AEIOU][a-z][A-Z]\\d\\s"));
        System.out.println(isPresent("AOgJ4 Z","[AEIOU][a-z][A-Z]\\d\\sZ$"));
        System.out.println(isPresent("AOgJ4 @TRZ","[AEIOU][a-z][A-Z]\\d\\s[@][A-Z]{2,4}$"));
        System.out.println(isPresent("AOgJ4 @@@@@TRZ","[AEIOU][a-z][A-Z]\\d\\s@+[A-Z]{2,4}$"));

        System.out.println("*****************");

        System.out.println(isPresent("My phone number is 476",".*\\d+.*"));
        System.out.println(isPresent("test@example.com","^[\\w]+[@][\\w]+[.][A-Za-z]{2,6}$"));
//        Pattern pattern= Pattern.compile("java");
//        Matcher matcher=pattern.matcher(input);
//        System.out.println(matcher.find());
        //System.out.println(Pattern.compile("Java").matcher(input).find());
String nameWithDOB="John was born on 12-05-1990 and marry on 23/11/1983";
Pattern pattern=Pattern.compile("\\d{2}[-/]\\d{2}[-/]\\d{4}");
Matcher matcher=pattern.matcher(nameWithDOB);
List<String> dates=new ArrayList<>();
while(matcher.find()){
    dates.add(matcher.group());
}
        System.out.println(dates);
String str="Hello there, I am Swetha and I work in Automation";
String[] str1=str.split(" ");
        Pattern pattern1=Pattern.compile("^[A-Z][a-z]*"); //^[A-Z].*

for(String strr:str1){
    if(pattern1.matcher(strr).find()){
        System.out.println(strr);
    }
}
        //validate IPv4 address b/w o-255
        String IPv4="244.244.244.244";
//        Pattern pattern2=Pattern.compile("\\d{0,3}[.]\\d{0,3}[.]\\d{0,3}[.]\\d{0,3}");
        Pattern pattern2=Pattern.compile("\\d[0-2]{0,1}\\d[0-4]{0,2}[.]\\d[0-2]{0,1}\\d[0-4]{0,2}[.]\\d[0-2]{0,1}\\d[0-4]{0,2}[.]\\d[0-2]{0,1}\\d[0-4]{0,2}");
        Matcher matcher2=pattern.matcher(IPv4);
        System.out.println(matcher2.find()+"$$$$$$$$$$");

        System.out.println(isPresent("93","\\d[0-9]"));
//1. Check if a string contains digits
        String inputdigts = "My phone number is 12345";
        Pattern p=Pattern.compile(".*\\d+.*");
        Matcher m=p.matcher(inputdigts);
        System.out.println(m.find()+" : Digit found in inputDigit String");

//2. Validate email address

        String email = "test@example.com";
        Pattern emailp=Pattern.compile("^[\\w.-]+[@].[\\w.-]+[.][A-Za-z]{2,6}$");
        Matcher emailm=emailp.matcher(email);
        System.out.println(emailm.find()+" email pattern matched");


// 3. Extract numbers from a string
        String inputnum = "Order123, Invoice456";
        Pattern nump=Pattern.compile("\\d+");
        Matcher numm=nump.matcher(inputnum);
        while (numm.find()){
            System.out.println(numm.group() + " ");
        }

//4. Replace all whitespaces
        String messy = "Java   is \t awesome!";
        String cleaned=messy.replaceAll("\\s+","");
        System.out.println(messy+ " : is messy");
        System.out.println(cleaned+" : is clean code");

// 5. Validate phone number (e.g., US format)
        String phone = "123-456-7890";
        Pattern pp=Pattern.compile("^\\d{3}-\\d{3}-\\d{4}");
        Matcher mm=pp.matcher(phone);
        System.out.println(mm.find() +" : Pattern matched");



//        Bonus: Pattern Flags
//        You can make patterns case-insensitive:
//        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("I love Java");
//        System.out.println(matcher.find()); // true
//        Tips for Automation Testers:
//        Use regex in assertions with API responses.
//                Clean dynamic values from logs before validation.
//        Validate formats (email, timestamp, ID) using .matches().
//                Practice Exercise for You:
//        Write a regex to validate dates in format dd/mm/yyyy.
//                Extract all words starting with capital letters from a paragraph.
//                Replace all HTML tags with an empty string (basic HTML cleanup).

    }


    public static boolean isPresent(String input,String search){
       return Pattern.compile(search).matcher(input).find();
    }
}

package Java_Practise.Strings;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class subString {
   @Test()
   public void subString() {
       //1. Write a Java method to check if a given substring exists within a string. string "Hello world" substring="Hello".

       String str = "Hello world";
       String substr = "world";
       System.out.println(str.contains(substr));

   }
//2. Write a Java method to count the number of times a substring occurs in a given string
@Test()
public void subStringOccurance(){
        String s = "Hello, World World";
        String sub = "World";
        int count=0;
        String[] st=s.split(" ");
        for(String word:st){
            if(word.contains(sub)){
                count++;
            }
        }
    System.out.println("SubString Word is : "+count);
       }
    @Test()
    public void subdomain() {
//3. Extracting a 'Subdomain' from a URL: String url = "https://subdomain.example.com";
        String url = "https://subdomain.example.com";
        int startsubdomain=url.indexOf("://")+3;
        int endsubdomain=url.indexOf(".",startsubdomain);
        System.out.println(url.substring(startsubdomain,endsubdomain));
//4. Extracting a File Extension:String filename = "document.pdf";
        String filename = "document.pdf";
        int end=filename.lastIndexOf(".")+1;
        System.out.println(filename.substring(end));
    }
    @Test()
    public void revString(){
//5. Reverse A string in 5 ways.
// a.Using StringBuilder or StringBuffer
        String name = "java";
        StringBuilder sb=new StringBuilder(name);
        System.out.println(sb.reverse());
// b.Using a for Loop
        String revName="";
        for(int i=name.length()-1;i>=0;i--){
        revName=revName+name.charAt(i);
}
        System.out.println(revName);
// c.Using Character Array
        String revName1="";
        char[] revN=name.toCharArray();
        for(int i=revN.length-1;i>=0;i--) {
            revName1 = revName1 + name.charAt(i);
        }
        System.out.println(revName1);
// d.Using Java 8 Streams
// e.Using Recursion
        }
    @Test()
    public void palandrome() {
            //6.check if a String is a palindrome?
            String p1 = "level";
            StringBuilder sb=new StringBuilder(p1);
            String p2=sb.reverse().toString();
            int p1Size=p1.length();
            int p2Size=sb.length();
            if(p1Size==p2Size) {
                for (int i = 0; i < p1Size; i++) {
                    for (int j = 0; j < p2Size; j++) {
                        if (p1.charAt(i) == p2.charAt(j)) {
                        continue;
                        }
                        else
                            System.out.println("not palandrome");
                    }
                }
                System.out.println("Palandrome");
            }
        }
    @Test()
    public void removeWhiteSpaces() {
//7. remove whitespace from the beginning and end of a String?
        String s3 = "  Hellowen  ";
        String s4=s3.trim();
        System.out.println("Trimed s3 is : "+s4);
    }
    @Test()
    public void assertthat() {
        //Explain how you would handle string comparisons in test automation assertions.
        //Answer: Use the assertEquals method from a testing framework like JUnit or
        // TestNG to compare expected and actual string values.
        String s1="Java";
        String s2="Java";
        Assert.assertEquals(s1,s2);
        System.out.println("******");

    }
         //9.: Describe a scenario where string manipulation might be necessary in test automation.
        //Answer: String manipulation is necessary when dealing with dynamic data. For example,
        // extracting specific parts of a URL to verify its correctness or formatting dates and times for input fields.
         @Test()
         public void ReverseWordSent() {
            //10.ReverseWordsInSentence
            String sw = "my name is java";

        }
//11.String Interning:
//Java uses a unique feature called "string interning" to optimize memory usage.
// When you create a string literal, the JVM checks if the string already exists
// in the string pool. If it does, the new reference points to the existing string.
// This reduces memory overhead for frequently used strings.

//12.String's Performance Impact with Concatenation
//Concatenating strings using the + operator inside a loop can lead to performance issues
// because each concatenation creates a new string object. Instead, using StringBuilder
// or StringBuffer is recommended for efficient string manipulation.



}

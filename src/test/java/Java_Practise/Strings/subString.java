package Java_Practise.Strings;


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
        for(int i=0;i<st.length;i++){
            if(st[i].contains(sub)){
                count++;
            }
        }
        System.out.println(count);}
    @Test()
    public void subdomain() {
//3. Extracting a Subdomain from a URL: String url = "https://subdomain.example.com";
        String url = "https://subdomain.example.com";
        int start = url.indexOf("://")+3;
        int end = url.indexOf(".");
        System.out.println(start);
        System.out.println(end);
        System.out.println(url.substring(start,end));

//4. Extracting a File Extension:String filename = "document.pdf";
        String filename = "document.pdf";
        int endd = filename.lastIndexOf(".")+1;
        System.out.println(endd);
        System.out.println(filename.substring(endd));

    }
    @Test()
    public void revString(){
//5. Reverse A string in 5 ways.
// a.Using StringBuilder or StringBuffer
            String name = "java";
            StringBuilder sb = new StringBuilder(name);
            String reversedString=sb.reverse().toString();
            System.out.println(reversedString);
// b.Using a for Loop
            String rev = "";
            //StringBuilder sb=new StringBuilder();
            for (int i = name.length()-1; i>=0; i--) {
                rev += name.charAt(i);
            }
            System.out.println(rev);
// c.Using Character Array
            String rev1 = "";
            char[] name1 = name.toCharArray();
            for (int i = name.length()-1; i>=0; i--) {
                rev1 += name.charAt(i);
            }
        System.out.println(rev1);
// d.Using Java 8 Streams
// e.Using Recursion
        }
    @Test()
    public void palandrome() {
            //6.check if a String is a palindrome?
            String p1 = "level";
            StringBuilder sb = new StringBuilder(p1).reverse();
            String p2 = String.valueOf(sb);
            System.out.println(p1 + " : " + p2);
            int l1 = p1.length();
            int l2 = p2.length();
            if (l1 == l2) {
                if (p1.equals(p2)) {
                    System.out.println("Palandrome");
                } else
                    System.out.println("Not Palandrome");
            } else
                System.out.println("l1 is not equal to l2");
        }
    @Test()
    public void removeWhiteSpaces(){
//7. remove whitespace from the beginning and end of a String?
    String s3="  Hellowen  ";
    String s4=s3.trim();
        System.out.println(s4);}
    @Test()
    public void assertthat(){
        //Explain how you would handle string comparisons in test automation assertions.
        //Answer: Use the assertEquals method from a testing framework like JUnit or
        // TestNG to compare expected and actual string values.
        String s5="test";
        String s6="test";
         assertEquals(s5,s6);}
         //9.: Describe a scenario where string manipulation might be necessary in test automation.
        //Answer: String manipulation is necessary when dealing with dynamic data. For example,
        // extracting specific parts of a URL to verify its correctness or formatting dates and times for input fields.
         @Test()
         public void ReverseWordSent() {
            //10.ReverseWordsInSentence

            String sw = "my name is java";
            String wordRev;
            String[] word = sw.split(" ");
            StringBuilder revsent = new StringBuilder();
            for (String words : word) {
                wordRev = new StringBuilder(words).toString();
                revsent.append(wordRev).append(" ");

            }
            System.out.println(revsent.toString().trim());
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

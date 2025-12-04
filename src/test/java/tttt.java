import org.openqa.selenium.json.JsonOutput;

import java.sql.SQLOutput;
import java.util.*;

public class tttt {
    public static void main(String[] args) {
        String str="A AN*N A*N";
        String[] splitStr=str.split("[ ,*]"); //[ ,*] = it will split with space and * both
        for(String s:splitStr){
            System.out.println(s);
        }
        //reverse a word using 2  pointer approch
        String TPA="anagramm";
        char[] tPA=TPA.toCharArray();
       int first=0;
       int last=tPA.length-1;
       while(first<last){
           char temp=tPA[first];
           tPA[first]=tPA[last];
           tPA[last]=temp;
           first++;
           last--;
       }
        System.out.println(tPA);
       String st="tsetTRe"; //o/p:tsettre
        System.out.println(st.toLowerCase().trim());
        System.out.println(st.replace("TR","AB"));
        System.out.println(st.substring(1,4));//print set

        String strr="AmazonAzonma";
        //count number of times Amazon word occures in this ,
        // use collection class= string methods with list or map
        String exp="Amazon";

String strrr="I am a SDET"; //o/p: TEDS a ma I
        String[] strrrc=strrr.split(" ");
        String revOfStrr="";
        String rr="";
        for(int i=strrr.length()-1;i>=0;i--){
            rr=rr+strrr.charAt(i);
        }
        System.out.println(rr);
        //using for i
        StringBuilder sb=new StringBuilder();
        for(int i=strrrc.length-1;i>=0;i--){
            sb=new StringBuilder(strrrc[i]).reverse().append(" ");
            revOfStrr=revOfStrr+sb;
        }
        System.out.println(revOfStrr.trim());
        // advanced fopr loop
        String rev="";
        StringBuilder output=new StringBuilder();
        for(String stra:strrrc){
             rev=new StringBuilder(stra).reverse().toString();
             output.append(rev).append(" ");
        }
        System.out.println(output);

        String input = "Testing"; // replace T.t with o
        String newinput=input.replaceAll("(?i)t","o");
        System.out.println(newinput);

        String[] fruits = {"mango", "Apple", "orange"};//print a friuit that starts with aeiou
       for(String f:fruits){
           f.matches("^[AEIOUaeiou].*");
       }
// 1. Write a Java method to check if a given substring exists within a string.
        String string= "Hello world", substring="Hello";
        System.out.println(string.contains(substring));


//2. Write a Java method to count the number of times a substring occurs in a given string
        String ocSubString="my name is name is name is name my name is name good name";
        String[] ocsubs=ocSubString.split(" ");
        String ocss="name";
        int count=0;
        for(String s:ocsubs){
            if(ocss.equalsIgnoreCase(s)){
                count++;
            }
        }

        System.out.println(count);
//3. Extracting a Subdomain from a URL:
        String url = "https://subdomain.example.com";
        int findex=url.indexOf("://")+3;
        int lindex=url.indexOf(".",findex);
        System.out.println(url.substring(findex,lindex));
//4. Extracting a File Extension:String
        String filename = "document.pdf";
        int beginingindex=filename.lastIndexOf(".")+1;
        System.out.println(filename.substring(beginingindex));
//5. Reverse A string in 5 ways. a.Using StringBuilder or StringBuffer b.Using a for Loop c.Using Character Array d.Using Java 8 Streams e.Using Recursion
String s="name";
String r="";
for(int i=s.length()-1;i>=0;i--){
    r=r+s.charAt(i);
}
        System.out.println(r);

//6.check if a String is a palindrome? madam==madam
        String p="madam";
        //String re="";
        StringBuilder re=new StringBuilder(p).reverse();
        System.out.println(re);
        if(p.length()==re.length()){
        if(p.equalsIgnoreCase(re.toString())){
            System.out.println(re+ " : Palandrome : "+p);
        }}
//7. remove whitespace from the beginning and end of a String?
        String Wspace="    name  ";
        System.out.println(Wspace.trim());
//8.  Explain how you would handle string comparisons in test automation assertions.
//Answer: Use the assertEquals method from a testing framework like JUnit or TestNG to compare expected and actual string values.
//9.: Describe a scenario where string manipulation might be necessary in test automation.
//Answer: String manipulation is necessary when dealing with dynamic data. For example, extracting specific parts of a URL to verify its correctness or formatting dates and times for input fields.
//10.ReverseWordsInSentence
        String Word="My name is name";
        String[] word=Word.split(" ");
        String revSent="";
        for(String sent:word ){
            StringBuilder revWord=new StringBuilder(sent).reverse().append(" ");
            revSent=revSent+revWord.toString();
        }
        System.out.println(revSent.trim());
//Concatenating strings using the + operator inside a loop can lead to performance issues because each concatenation creates a new string object. Instead, using StringBuilder or StringBuffer is recommended for efficient string manipulation.
//************************
//Reverse an Array
        int num[]={9,8,7,6,5};
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
//Find the Missing Number {2,3,5,6,7,8};
        int[] mn={2,3,5,6,7,8};
        for(int i=0;i<mn.length;i++){
            if(mn[i]+1!=mn[i+1]){
                System.out.println("missing Number is "+(mn[i]+1));
                break;
            }
            else
                System.out.println("no missing num");
        }
//Find Duplicate Elements  int[] num={1,5,6,4,1,5};
        int[] numb={1,5,6,4,1,5};
        List<Integer> numbe=new ArrayList<>();
        Set<Integer> duplicates=new HashSet<>();
        for(int i=0;i<numb.length;i++){
            if(numbe.contains(numb[i])){
                duplicates.add(numb[i]);
            }else
                numbe.add(numb[i]);
        }
        System.out.println(" duplicates"+duplicates);
// Merge Two Sorted Arrays
        int[] n1={1,2,3,4};
        int[] n2={5,6,7,8};
        List<Integer> n1n2=new ArrayList<>();
        for(int i=0;i<n1.length;i++){
            n1n2.add(n1[i]);
        }
        for(int i=0;i<n2.length;i++){
            n1n2.add(n2[i]);
        }
        System.out.println(n1n2);
//Draw star pyramid using java
//        int n=5;
//        for(int i=1;i<=n;i++){
//            System.out.print("*");
//            for(int j=i+1;j<n;j++){
//                System.out.print("");
//            }
//
//            for(int k=1;k<(i*2)-1;k++){
//                System.out.println(" ");
//            }
//        }
//Java Array Problem Using Two For Loops  //find the pair whose sum is 10
        int[] tl={0,1,2,3,4,5,6,7,8,9};
        int sum=10;
        for(int i=0;i<tl.length-1;i++){
            for(int j=i+1;j<tl.length;j++){
                if(tl[i]+tl[j]==sum){
                    System.out.println("{"+tl[i]+","+tl[j]+"}");
                }
            }
        }
//Anagram
//Array in Assending order
//Even or odd
        for(int i=0;i<numb.length;i++){
            if(numb[i]%2==0){
                System.out.println(numb[i]+" : is even");
            }else
                System.out.println(numb[i]+" : is odd");
        }
//first highest number
        int[] hshs={1,2,3,6,8,0};
        int fHighest=Integer.MIN_VALUE;
        int sfHighest=Integer.MIN_VALUE;
        for(int i=0;i<hshs.length;i++){
            if(hshs[i]>fHighest){
                fHighest=hshs[i];
            }
        }
        System.out.println("First Highest num is: "+fHighest);
//Secondhighest number
        for(int i=0;i<hshs.length;i++){
            if(hshs[i]>fHighest){
                fHighest=hshs[i];
            }
        }
        for(int i=0;i<hshs.length;i++){
            if(hshs[i]>sfHighest && hshs[i]!=fHighest){
                sfHighest=hshs[i];
            }
        }
        System.out.println("Second Highest num is: "+sfHighest);
//second lowest number
        int fSmall=Integer.MAX_VALUE;
        int sfSmall=Integer.MAX_VALUE;
        for(int i=0;i<hshs.length;i++){
            if(hshs[i]<fSmall){
                fSmall=hshs[i];
            }
        }
        System.out.println("First Smallest num is: "+fSmall);
        for(int i=0;i<hshs.length;i++){
            if(hshs[i]<sfSmall && hshs[i]!=fSmall){
                sfSmall=hshs[i];
            }
        }
        System.out.println("Sexons Smallest num is: "+sfSmall);
//sum of array
        sum=0;
        for(int i=0;i<hshs.length;i++){
           sum=sum+hshs[i];
            }
        System.out.println(sum+" : is sum og all numbers in ");


        //==============================
//factorial, febonacci, is prime, rev a number, rev string, rev words in sentence, sub string, swap2 numbers without third
//Anagram
//CountVowels
//elementStartDecrease
//ExpressionEvaluationRED
//FirstandLastOccurance
//firststrSubsequenceOfsecond
//pairElements
//PalindromeExample
//RearrangePosNegNumber
//RemoveConsecutiveDuplicate
//RevWordInSentence
//rotatebyN
//************************
//check string contains digits
//check string contains special characters
//concat 2 strings
//count capital and small letters
//countcharactersDigitsSepecial chars
//count consonets vowels
//count occurance of each character string
//count wordsin string
//factorial of num
//find last unique char
//first letter of each word
//first non repeated character
//fizzbuzz
//highest occurance of char
//occuranceof given char
//palandrome and palandrome string
//percentage of vowels and consonents
//print duplicate characters with count
//remove all leading zeros
//remove characters from string
//remove duplicate characters from string
//remove duplicates elemets char
//remove special chars from string
//remove white spaces from string
//replace charactersin String
//reverse each word of string
//reverse string
//reverse words in string
//rev string ad sort string
//swap first and last char of string

//**************************************

    }
    }

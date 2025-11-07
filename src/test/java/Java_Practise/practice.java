package Java_Practise;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class practice {
@Test
    public void strings() {
//1. Write a Java method to check if a given substring exists within a string. string "Hello world" substring="Hello".
    String str="Hello World";
    String substring="World";
    System.out.println(str.contains(substring));
//2. Write a Java method to count the number of times a substring occurs in a given string
    String sentence = "My name is name with a name of name";
    String subString="name";
    int count=0;
    String[] sent=sentence.split(" ");
    for(String senten:sent){
        if(senten.contains(subString)){
            count++;
        }
    }
    System.out.println("name is displaying " +count+" times");
//3. Extracting a Subdomain from a URL: String url = "https://subdomain.example.com";
    String url = "https://subdomain.example.com";
    int startindex=url.indexOf("://")+3;
    int endindex=url.indexOf(".",startindex);
    System.out.println(url.substring(startindex,endindex));
//4. Extracting a File Extension:String filename = "document.pdf";
    String filename = "document.pdf";
    int endIndex=filename.indexOf(".")+1;
    System.out.println(filename.substring(endIndex));

//5. Reverse A string in 5 ways. a.Using StringBuilder or StringBuffer b.Using a for Loop c.Using Character Array d.Using Java 8 Streams e.Using Recursion
    String name="Hello world";
    StringBuilder sb=new StringBuilder(name);
    System.out.println(sb.reverse().toString());

    String revname="";
    for(int i=name.length()-1;i>=0;i--){
        revname=revname+name.charAt(i);
    }
    System.out.println(revname);
//6.check if a String is a palindrome?
    String palandrome="lol";
    String rev="";
    for(int i=palandrome.length()-1;i>=0;i--) {
        rev=rev+palandrome.charAt(i);
    }
    System.out.println(rev);
    if(palandrome.equals(rev)){
        System.out.println("Palandrome is "+palandrome);
    }
    else
        System.out.println("not Palandrome "+palandrome);

//7. remove whitespace from the beginning and end of a String?
    String namee="   name  ";
    System.out.println(namee.trim());
//8.  Explain how you would handle string comparisons in test automation assertions.
    String one="one";
    String two="one";
    Assert.assertEquals(one,two);
    System.out.println("**********");

//Answer: Use the assertEquals method from a testing framework like JUnit or TestNG to compare expected and actual string values.
//9.: Describe a scenario where string manipulation might be necessary in test automation.
//Answer: String manipulation is necessary when dealing with dynamic data. For example, extracting specific parts of a URL to verify its correctness or formatting dates and times for input fields.
//10.ReverseWordsInSentence
//Concatenating strings using the + operator inside a loop can lead to performance issues because each concatenation creates a new string object. Instead, using StringBuilder or StringBuffer is recommended for efficient string manipulation.
    System.out.println(namee.concat(one));
}
    @Test
    public void arrays() {
        //Reverse an Array
        int[] arrNumbers={1,2,3,4,5};
        for(int i=arrNumbers.length-1;i>=0;i--){
            System.out.println(arrNumbers[i]);
        }
//Find the Missing
int[] Number= {1,2,3,5,6};
int n=6;
        int expected=n*(n+1)/2;
        int actual=0;
        for(int digits:Number){
            actual=actual+digits;
        }
        //System.out.println(actual);
        int missingNumber=expected-actual;
        System.out.println("***** "+missingNumber+" ******");
//Find Duplicate Elements  int[] num={1,5,6,4,1,5};
        int[] d={1,5,6,4,1,5};
        List lis=new ArrayList();
        Set duplicate=new HashSet();
        for(int i=0;i<d.length-1;i++){
for(int j=i+1;j<d.length;j++){
    if(d[i]==d[j]){
        duplicate.add(d[i]);
    }else
        lis.add(d[i]);
}
        }
        System.out.println("Duplicates are: "+duplicate);

// Merge Two Sorted Arrays
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        List li=new ArrayList();
        for(int arr:arr1){
            li.add(arr);
        }
        for(int arr:arr2){
            li.add(arr);
        }
        System.out.println(li);

//Draw star pyramid using java
        int numb=5;
        for(int i=1;i<=numb;i++){
            for(int j=i+1;j<numb;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
//Java Array Problem Using Two For Loops  //find the pair whose sum is 10

    }
    @Test
    public void newArray(){
    //Anagram String arr1="Listen"; String arr2="Silent";
        String arra1="Listen";
        String arra2="Silent";

        char[] s1=arra1.toCharArray();
        char[] s2=arra2.toCharArray();
        if(arra1.length()==arra2.length()){
       for(int i=0;i<arra1.length();i++){

       }

        System.out.println(s1);
        System.out.println(s2);

//Array in Assending order
        int[] ne={2,3,5,7,9,1,4};
        Set<Integer> setnum=new HashSet<>();
        for(int i=0;i<ne.length;i++){
            setnum.add(ne[i]);}
        System.out.println(setnum);
//Even or odd
            for(int i=0;i<ne.length;i++){
               if(ne[i]%2==0){
                   System.out.println(ne[i]+" : is even");}
               else System.out.println(ne[i]+" : is odd");}
//first highest number
            int firstHighest=ne[0];
        for(int i=0;i<ne.length;i++){
            if (ne[i]>firstHighest) {
                firstHighest=ne[i]; }
        }
            System.out.println(firstHighest+ " : first highest number");
//Secondhighest number
            int secondHighest=ne[0];
            int oneHighest=ne[0];
        for(int i=0;i<ne.length;i++) {
            if (ne[i] >oneHighest) {
                oneHighest = ne[i];
            }
        }
           // System.out.println(oneHighest+" is first highest");
            for(int j=0;j<ne.length;j++) {
            if (ne[j]>secondHighest && ne[j]!=oneHighest) {
                secondHighest=ne[j];
            }
            }
            System.out.println(secondHighest+ " : second highest number");
            //int[] ne={2,3,5,7,9,1,4};
            int firstlowest=ne[0];
            int seclowest=ne[0];
//second lowest number
            for(int i=0;i<ne.length;i++) {
                    if (ne[i]<firstlowest) {
                       firstlowest=ne[i];
                    }
            }
            //System.out.println(firstlowest+ " : first lowest number");
            for(int i=0;i<ne.length;i++) {
                if (ne[i]<seclowest && ne[i]!=firstlowest) {
                    seclowest=ne[i];
                }
            }
            System.out.println(seclowest+ " : sec lowest number");
//sum of array
}
    }}


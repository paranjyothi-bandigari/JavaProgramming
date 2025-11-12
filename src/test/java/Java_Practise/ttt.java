package Java_Practise;
//1. Write a Java method to check if a given substring exists within a string. string "Hello world" substring="Hello".
//2. Write a Java method to count the number of times a substring occurs in a given string
//3. Extracting a Subdomain from a URL: String url = "https://subdomain.example.com";
//4. Extracting a File Extension:String filename = "document.pdf";
//5. Reverse A string in 5 ways. a.Using StringBuilder or StringBuffer b.Using a for Loop c.Using Character Array d.Using Java 8 Streams e.Using Recursion
//6.check if a String is a palindrome?
//7. remove whitespace from the beginning and end of a String?
//8.  Explain how you would handle string comparisons in test automation assertions.
//Answer: Use the assertEquals method from a testing framework like JUnit or TestNG to compare expected and actual string values.
//9.: Describe a scenario where string manipulation might be necessary in test automation.
//Answer: String manipulation is necessary when dealing with dynamic data. For example, extracting specific parts of a URL to verify its correctness or formatting dates and times for input fields.
//10.ReverseWordsInSentence
//Reverse an Array
//Find the Missing Number {2,3,5,6,7,8};
//Find Duplicate Elements  int[] num={1,5,6,4,1,5};
// Merge Two Sorted Arrays
//Draw star pyramid using java
//Java Array Problem Using Two For Loops  //find the pair whose sum is 10
//Anagram
//Array in Assending order
//Even or odd
//first highest number
//Secondhighest number
//second lowest number
//sum of array

import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class ttt {
    @Test
    public void testing001(){
        String word ="Hello world", substring="world";
        word.contains(substring);
        System.out.println(word.contains(substring));
        String noofword=" hellow world where is world when world will revolve";
        String[] noOfWord=noofword.split(" ");
        int count=0;
        for(String wordd:noOfWord){
            if(wordd.contains(substring)){
                count++;
            }
        }
        System.out.println("word is repeating no of times : "+count);
        String url = "https://subdomain.example.com";
        int firstIndex=url.indexOf("://")+3;
        int lastIndex=url.indexOf(".",firstIndex);
        System.out.println(url.substring(firstIndex,lastIndex));
        String filename = "document.pdf";
        int lasttIndex=filename.indexOf(".")+1;
        System.out.println(filename.substring(lasttIndex));
        String name="    name   ";
        System.out.println(name.trim());
        String name1="eesha";
        String name2="eesha";
        Assert.assertEquals(name1,name2);
        System.out.println(name1.concat(name2));
//rev a string , palandrome, rev words in string
        String Pname="lifil";
        String recPname="";
        for(int i=Pname.length()-1;i>=0;i--){
            recPname=recPname+Pname.charAt(i);
        }
        System.out.println(recPname);
        if(Pname.equalsIgnoreCase(recPname)){
            System.out.println(Pname+" is a palandrome");
        }
        else
        {
            System.out.println("not palandrome");
        }

        String namee="Java";
        String revnamee="";
        for(int i=namee.length()-1;i>=0;i--){
          revnamee=revnamee+namee.charAt(i);
        }
        System.out.println(revnamee);
        StringBuilder sbrevname=new StringBuilder(namee);
        sbrevname.reverse();
        System.out.println(sbrevname.toString());
        System.out.println("*************");
        String sentence="my name is java";
        String[] Sent=sentence.split(" ");
        String Senten="";
        for(String sen:Sent){
            StringBuilder sbWords=new StringBuilder(sen).reverse().append(" ");
            Senten=Senten+sbWords;
        }
        System.out.println(Senten.toString().trim());
        //Anagram
        String arr1="listen"; String arr2="silent";
        char[] arr11=arr1.toCharArray();
        char[] arr22=arr2.toCharArray();
        Arrays.sort(arr11);
        Arrays.sort(arr22);
        System.out.println(arr11);
        System.out.println(arr22);
        if(Arrays.equals(arr11,arr22)){

            System.out.println("Anagram");
        }else
            System.out.println("Not Anagram");
    }
    //Reverse an Array
//Find the Missing Number {2,3,5,6,7,8};
//Find Duplicate Elements  int[] num={1,5,6,4,1,5};
// Merge Two Sorted Arrays
//Draw star pyramid using java
//Java Array Problem Using Two For Loops  //find the pair whose sum is 10
//Anagram
//Array in Assending order
//Even or odd
//first highest number//Secondhighest number//second lowest number
//sum of array
    @Test
    public void test002(){
        int[] arr={2,3,5,6,7,8};
        Arrays.sort(arr); //ass order
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println(sum+ " : is the sum of array");
       Set s1=new TreeSet();
        for(int i=0;i<arr.length;i++){
            s1.add(arr[i]);
        }
        System.out.println(s1); // assending order
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstHighest){
                firstHighest=arr[i];
            }
        }
        System.out.println(firstHighest+" is first Highest number in arr");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondHighest && arr[i]!=firstHighest){
                secondHighest=arr[i];
            }
        }
        System.out.println(secondHighest+" is second Highest number in arr");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<firstLowest){
                firstLowest=arr[i];
            }
        }
        System.out.println(firstLowest+" is first lowest number in arr");
        for(int j=0;j<arr.length;j++){
            if(arr[j]<secondLowest && arr[j]!=firstLowest){
                secondLowest=arr[j];
            }
        }
        System.out.println(secondLowest+" is second lowest number in arr");

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" : is Even number");
            }
            else
                System.out.println(arr[i]+" : is odd number");
        }
//Find the Missing Number {2,3,5,6,7,8};
        int[] numbers={2,3,5,6,7,8};
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]+1!=numbers[i+1]){
                System.out.println("Missing number is: "+(numbers[i]+1));
                break;
            }
        }
//Find Duplicate Elements  int[] num={1,5,6,4,1,5};
        int[] num={1,5,6,4,1,5};
        List nu=new ArrayList();
        Set<Integer> duplicates=new TreeSet<>();
        for(int i=0;i<num.length;i++){
           if(!nu.contains(num[i])){
               nu.add(num[i]);

           }else
               duplicates.add(num[i]);

        }
        System.out.println(duplicates);
// Merge Two Sorted Arrays
        int[] a1={1,2,3};
        int[] a2={4,5,6};
        List<Integer> sortedArray=new ArrayList<>();
        for(int i=0;i<a1.length;i++){
            sortedArray.add(a1[i]);
        }
        for(int i=0;i<a2.length;i++){
            sortedArray.add(a2[i]);
        }
        System.out.println(sortedArray);
//Draw star pyramid using java
        int row=6;
        for(int i=1;i<=row;i++){
            for(int j=i+1;j<row;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int numb=6;
        for(int i=1;i<=numb;i++){
            for(int j=i+1;j<numb;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

//Java Array Problem Using Two For Loops  //find the pair whose sum is 10
        int[] a3={3,4,5,6,7,8,9,2,1};
        int pairsum=10;
        for(int i=0;i<a3.length;i++){
            for(int j=i+1;j<a3.length;j++){
                if(a3[i]+a3[j]==10){
                    System.out.println("{"+a3[i]+","+a3[j]+"}");
                }

            }
        }
    }
}

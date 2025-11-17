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
    @Test
    public void test003() {
        //check string contains digits
        String sc="name";
        String dig="43567";
        System.out.println(sc.concat(dig));
//check string contains special characters
        String spl="@#$%^Y";
        System.out.println(sc.concat(spl));
//concat 2 strings
        String fName="Eesha";
        String lName="Koppala ";
        System.out.println(lName.concat(fName));
//count capital and small letters
        String CapitalSmall="PrintLN Cap Small";
        int UpperCaseCount=0;
        int LowerCaseCount=0;
        for(int i=0;i<CapitalSmall.length();i++){
        char c=CapitalSmall.charAt(i);
        if(Character.isUpperCase(c)){
            UpperCaseCount++;
        } else if (Character.isLowerCase(c)) {
            LowerCaseCount++;
        }else
            System.out.println("Not Upper Not Lower case" +c);
        }
        System.out.println("Upper case count is: "+UpperCaseCount);
        System.out.println("Lower case count is: "+LowerCaseCount);
//countcharactersDigitsSepecial chars
        String CountCDS="PrintLN$%&*980 Cap@#!45 Small6!#"; //alp=15, d=6, s=9
        int charCount=0;
        int digits=0;
        int special=0;
        int scount=0;
        for(int i=0;i<CountCDS.length();i++){
            char c=CountCDS.charAt(i);
            if(Character.isAlphabetic(c)){
                charCount++;
            } else if (Character.isDigit(c)) {
                digits++;
            }else if(Character.isSpaceChar(c)){
                special++;
            }else
                scount++;
        }
        System.out.println("Alphebet count is "+charCount);
        System.out.println("digits count is "+digits);
        System.out.println("special count is "+scount);
        System.out.println("space count is "+special);
//count consonets vowels
        String CV="Orange"; //v=3, c=3
        int vowelCount=0;
        int consonentsCount=0;
        for(int i=0;i<CV.length();i++){
            if(CV.charAt(i)=='A'||CV.charAt(i)=='E'||CV.charAt(i)=='I'||CV.charAt(i)=='O'||CV.charAt(i)=='U'||
                    CV.charAt(i)=='a'||CV.charAt(i)=='e'||CV.charAt(i)=='i'||CV.charAt(i)=='o'||CV.charAt(i)=='u'){
                vowelCount++;
            }else
                consonentsCount++;
        }
        System.out.println("Vowels count is : "+vowelCount);
        System.out.println("Consonents count is : "+consonentsCount);
//count wordsin string
        String wordsCount="my name is Java";
        String[] WordsCount=wordsCount.split(" ");
        int wordcount=0;
        for(int i=0;i<WordsCount.length;i++){
            wordcount++;
        }
        System.out.println("Words count in a sentence is : "+wordcount);
//factorial of num
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
//find last unique char
        String uniqueCharFind="daddy";
        char uc;
        for(int i=0;i<uniqueCharFind.length();i++){

        }
//first letter of each word
        String FLOEW="";
        String[] wordsCountt=wordsCount.split(" ");
        for(int i=0;i<wordsCountt.length;i++){

        }
//first non repeated character
//fizzbuzz
//highest occurance of char
//occuranceof given char
//palandrome numb and palandrome string
//percentage of vowels and consonents
//print duplicate characters with count
//remove all leading zeros
//remove characters from string
//remove duplicate characters from string
//remove duplicates elemets char
//remove special chars from string
//remove white spaces from string
//replace charactersin String
//reverse words in string
//rev string and sort string
//swap first and last char of string
// count occurance of each character string
    }
}

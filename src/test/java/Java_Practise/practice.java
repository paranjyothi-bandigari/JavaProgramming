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
            int sum=0;
            for(int i=0;i<ne.length;i++) {
               sum=sum+ne[i];
            }
            System.out.println("sum is : " +sum);
}
//firstRepeatingElementInArray
    }
    @Test
    public void strings1() {

        //factorial,
        int n=6;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        //febonacci
        int firstnumber=0;
        int secondnumber=1;
        int sum=0;
        int nu=10;
        System.out.println(firstnumber);
        //System.out.println(secondnumber);
        for(int i=1;i<=nu;i++){
            firstnumber=secondnumber;
            secondnumber=sum;
            sum=firstnumber+secondnumber;
            System.out.println(sum);
        }
         //isPrime
         n=5;
           if(n<=1){
               System.out.println("not prime");
           }else{
               for(int i=2;i<=Math.sqrt(n);i++){
                   if(n%i==0){
                       System.out.println("Not Prime");
                       break;
                   } else
                       System.out.println("Prime");
               }

        }
        //rev a number
        int num=123;
        int rev=0;
      while(num!=0){
           int digit=num%10; //digit=123%10=3 -->//rev=0*10+3=3 -->//num=123/10=12
           rev=rev*10+digit; //digit=12%10=2 -->//rev=3*10+2=32 -->//num=12/10=1
           num=num/10;       //digit=1%10=1 -->//rev=32*10+1=321 -->//num=1/10=
       }
        System.out.println("reverse of 123 is : "+rev);

        //rev a string
        String r="";
        String Wor="my name is eesha";
        for(int i=Wor.length()-1;i>=0;i--){
           r=r+Wor.charAt(i);
        }
        System.out.println(r);
        //  rev words in sentence
String Word="my name is eesha"; //eesha is name my
      String re="";
        StringBuilder sb=null;
     String[] word=Word.split(" ") ;
     for(int i=word.length-1;i>=0;i--){
        re=re+word[i]+" ";
          sb=new StringBuilder(re);

     }
        System.out.println(sb.toString());

        //  sub string
        String fullname="Eesha koppala";
        String firstname="Eesha";
        if(fullname.contains(firstname)){
            System.out.println(firstname+" is substring of "+fullname);
        }

        //  swap2 numbers without third
        int a=5;
        int b=6;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" ; "+b);

    }
    @Test
    public void strings2() {
//Anagram
      String anna1="evil";
      String anna2="live";
//      StringBuilder sba1=new StringBuilder(anna1);
//      StringBuilder sba2=new StringBuilder(anna2);
        //PalindromeExample
        String pal="madam";
        String rev=new StringBuilder(pal).reverse().toString();

                if(pal.equals(rev)){
                    System.out.println("Palandrome");
                }
                else{
                System.out.println("not palandrome");}

//CountVowels
        String VCName="Orange"; //v=3 c=3
        int countV=0;
        int countC=0;
        for(int i=0;i<VCName.length();i++){
            if(VCName.charAt(i)=='A' || VCName.charAt(i)=='a' || VCName.charAt(i)=='E'||
                    VCName.charAt(i)=='e'||VCName.charAt(i)=='I'||VCName.charAt(i)=='i'||
                    VCName.charAt(i)=='O'||VCName.charAt(i)=='o'||VCName.charAt(i)=='U'||
                    VCName.charAt(i)=='u')
            {
            countV++;
            }
            else{
                countC++;
            }
        }
        System.out.println(countV+" is Vowels count in "+VCName);
        System.out.println(countC+" is Consonents count in "+VCName);
        ////RearrangePosNegNumber
        int[] rearrangenum={2,3,-1,0,-5};
        Arrays.sort(rearrangenum);
        for(int numrearrange:rearrangenum){
            System.out.println(numrearrange);
        }

        //CountPair
//elementStartDecrease
        int[] ESD={1,3,5,7,9,8,6,2};
        int desc=0;
        for(int i=0;i<ESD.length;i++){
            if(ESD[i]>ESD[i+1]){
                desc=i;
                break;
            }
        } System.out.println(desc+" is the element start Decreasing");
//ExpressionEvaluationRED
//FirstandLastOccurance
        int arr[]={1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 };
        int value=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println(arr[i]+" is at first index : "+i);
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==value){
                System.out.println(arr[i]+" is at last index : "+i);
                break;
            }
        }
//firststrSubsequenceOfsecond
//pairElements
//RemoveConsecutiveDuplicate
//RevWordInSentence
//rotatebyN

    }

      }








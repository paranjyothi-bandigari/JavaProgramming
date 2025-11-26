import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tttt {
    public static void main(String[] args) {
        String input="Testing"; // replace T.t with o
        System.out.println(input.replaceAll("(?i)t","o"));

        String[] fruits={"mango","Apple","orange"};//print a friuit that starts with aeiou
        String check="aeiou";
        for(String fruit:fruits){
         char fl= fruit.charAt(0);
         //if(Character(fl).contains(check)){}
        }
        //1. Write a Java method to check if a given substring exists within a string.
  String s1= "Hello world" ;
    String substring="Hello";
    if(s1.contains(substring)){
        System.out.println(substring+" contains in "+s1);
    }else
        System.out.println("NA");
//2. Write a Java method to count the number of times a substring occurs in a given string
        String cname="my name is name is name in my name";
        String csub="name";
        int count=0;
        String[] cName=cname.split(" ");
        for(String bigName:cName){
            if(bigName.contains(csub)){
              count++;
            }
        }
        System.out.println("count of name string is : "+count);
//3. Extracting a Subdomain from a URL:
        String url = "https://subdomain.example.com";
        int findex=url.indexOf("://")+3;
        int lindex=url.indexOf(".",findex);
        System.out.println(url.substring(findex,lindex));
//4. Extracting a File Extension:
        String filename = "document.pdf";
        int llindex=filename.lastIndexOf(".")+1;
        System.out.println(filename.substring(llindex));

//5. Reverse A string in 5 ways. a.Using StringBuilder or StringBuffer b.Using a for Loop c.Using Character Array d.Using Java 8 Streams e.Using Recursion
        String name="Apple";
        String nameReverse="";
        for(int i=name.length()-1;i>=0;i--){
            nameReverse=nameReverse+name.charAt(i);
        }
        System.out.println(nameReverse);

        StringBuilder sb=new StringBuilder(name);
        System.out.println(sb.reverse());

//6.check if a String is a palindrome? // if name == rev of name
        String palandrome="level";
        String revPalandrome="";
        for(int i=name.length()-1;i>=0;i--){
            revPalandrome=revPalandrome+palandrome.charAt(i);
        }
        System.out.println(revPalandrome);
        if(palandrome.equalsIgnoreCase(revPalandrome)){
            System.out.println(palandrome+"="+revPalandrome);
        }
        else
            System.out.println("Not palandrome");
//7. remove whitespace from the beginning and end of a String?
        String tText="    Helloo";
        System.out.println(tText.trim());
//8.  Explain how you would handle string comparisons in test automation assertions.
//Answer: Use the assertEquals method from a testing framework like JUnit or TestNG to compare expected and actual string values.
//9.: Describe a scenario where string manipulation might be necessary in test automation.
//Answer: String manipulation is necessary when dealing with dynamic data. For example, extracting specific parts of a URL to verify its correctness or formatting dates and times for input fields.
//10.ReverseWordsInSentence
        String Worde=" My name is World";
        String[] Word=Worde.split(" ");
        String revWord="";
        StringBuilder sb1=new StringBuilder();
        for(String words:Word){
            StringBuilder sbword=new StringBuilder(words).reverse().append(" ");
           revWord=revWord+sbword.toString();
        }
        System.out.println(revWord.trim());
//Concatenating strings using the + operator inside a loop can lead to performance issues because each concatenation creates a new string object. Instead, using StringBuilder or StringBuffer is recommended for efficient string manipulation.
//************************
//factorial, febonacci, is prime, rev a number, rev string, rev words in sentence, sub string, swap2 numbers without third
//Reverse an Array
        int[] a1={2,3,5,6,7,8};
        for(int i=a1.length-1;i>=0;i--){
            System.out.println(a1[i]);
        }
        System.out.println("*********");
//Find the Missing Number {2,3,5,6,7,8};
        for(int i=0;i<a1.length-1;i++){
            if(a1[i]+1!=a1[i+1]){
                System.out.println(a1[i]+1);
            }
        }
//Find Duplicate Elements
        int[] num={1,5,6,4,1,5,8,6};
        Set<Integer> setOfUnique=new HashSet<>();
        List<Integer> listofDuplicate=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if(!setOfUnique.contains(num[i])){
                setOfUnique.add(num[i]);
            }
            else{
                listofDuplicate.add(num[i]);
            }
        }
        System.out.println(listofDuplicate);
// Merge Two Sorted Arrays
        int[] m1={1,2,3};
        int[] m2={4,5,6};
        List<Integer> mergedList=new ArrayList<>();
        for(int i=0;i<m1.length;i++){
            mergedList.add(m1[i]);
        }
        for(int i=0;i<m2.length;i++){
            mergedList.add(m2[i]);
        }
        System.out.println(mergedList);
//Draw star pyramid using java
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=i+1;j<n;j++){
//                System.out.print("*");
//            }
//            for(int k=1;k<(i*2)-1;k++){
//                System.out.println(" ");
//            }
//        }
//Java Array Problem Using Two For Loops  //find the pair whose sum is 10
//Anagram
//Array in Assending order
//Even or odd
        //int[] a1={2,3,5,6,7,8};
        for(int i=0;i<a1.length;i++){
            if(a1[i]%2==0){
                System.out.println(a1[i]+" is even");
            }else
                System.out.println(a1[i]+" is odd");
        }
//first highest number
        int highestnum= Integer.MIN_VALUE;
        int smallNum=Integer.MAX_VALUE;
        for(int i=0;i<a1.length;i++){
            if(a1[i]>highestnum){
                highestnum=a1[i];
            }
            System.out.println("&&&&&&&&");
            System.out.println(highestnum+" is the highest Number");
        }
//Secondhighest number
//second lowest number
//sum of array
    }
}

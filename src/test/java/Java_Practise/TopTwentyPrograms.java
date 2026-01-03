package Java_Practise;

import org.testng.annotations.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopTwentyPrograms {
   @Test
    public void anagramProgram(){
//listen ↔ silent
String anagramString1="listen";
       String anagramString2="silent";
char[] annagram1=anagramString1.toCharArray();
       char[] annagram2=anagramString2.toCharArray();
Arrays.sort(annagram1);
Arrays.sort(annagram2);
       System.out.println(annagram1);
       System.out.println(annagram2);
if(annagram1.length==annagram2.length){
   if(Arrays.equals(annagram1, annagram2)){
       System.out.println(anagramString1+" is Anagram of "+anagramString2);
   }else{
       System.out.println(anagramString1+" is not Anagram of "+anagramString2);
   }
}

   }

@Test
public void commonIntwoArrays(){
int[] arr1={1,2,3,4,7};
int[] arr2={3,5,7,9};
List<Integer> noncommon=new ArrayList<>();
    Set<Integer> common=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        noncommon.add(arr1[i]);
    }
    for(int j=0;j<arr2.length;j++){
        if(noncommon.contains(arr2[j])){
            common.add(arr2[j]);
        }else{
            noncommon.add(arr1[j]);
        }
    }
    System.out.println(common);

}

@Test
public void countPair(){
    //For an array of length n,
    //👉 Number of pairs = n × (n - 1) / 2
    int[] arr= {1,2,3,4,5,6};
    int count=0;
    int n=arr.length;
    count=n*(n-1)/2;
    System.out.println(count);
}

@Test
public void countVowels(){
String CountV="PARANJYOTHI";
    Pattern p=Pattern.compile("[AEIOUaeiou]");
    Matcher m=p.matcher(CountV);
   int count=0;
for(char i:CountV.toCharArray()){
    if(m.find()){
        count++;
        //System.out.println(m.group());
    }
}System.out.println(count);
}

@Test
public void elementStartDecrease(){
    int[] arrnum={0,1,2,3,2,1,0};
    int descNum=0;
    for(int i=0;i<arrnum.length-1;i++){
        if (arrnum[i]>arrnum[i+1]) {
          descNum=i;
          break;
        }
    }
    System.out.println(descNum+" : is the Index of DescNumber");

}

@Test
public void expressionEvaluationRED(){


}

@Test
public void firstandLastOccurance(){
    int arr[] = {1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 };
    int x = 1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
        System.out.println(arr[i]+" : is the first occurance of 1");
        break;
    }
}
    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]==x){
            System.out.println(arr[i]+" : is the last occurance of 1");
            break;
        }
    }

}

@Test
public void firstRepeatingElementInArray(){
    int arr[] = {10, 5, 3, 4, 3, 5, 6};
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]+" : is the duplicate element");
            }
        }
    }

}

@Test
public void firststrSubsequenceOfsecond(){
String subseq="Beat";
String sub="tea";

}

@Test
public void maxProductArrayOfposnegInteger(){
    Integer[] arr= {1,2,6,8,9};
    int a=arr[0],b=arr[1],c=arr[2];
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[i]*arr[j]*arr[k]>a*b*c){
                    a=arr[i];
                    b=arr[j];
                    c=arr[k];
                }
            }
        }
    }System.out.println(a+","+b+","+c+" Product is : "+a*b*c);
}

@Test
public void mergeTwoSortedArray(){
int[] a1={2,3,4};
int[] a2={5,6,7};
    List<Integer> mergedArray=new ArrayList<>();
    for(int i:a1) {
        mergedArray.add(i);
    }
    for(int i:a2) {
        mergedArray.add(i);
    }
    System.out.println(mergedArray);

}

@Test
public void pairElements(){
    int[] arr = {1, 5, 7, -1, 5};
    int targetSum = 6;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==targetSum){
                System.out.println("{"+arr[i]+","+arr[j]+"="+targetSum+"}");
            }
        }
    }
}

@Test
public void palindromeExample(){ // rev of wor is same as given word then its palandrome
String palandromeString="A man a plan a canal Panama";
String a=palandromeString.toLowerCase().replaceAll(" ","");
String rev="";
        for(int i=a.length()-1;i>=0;i--){
    rev=rev+a.charAt(i);
}
            System.out.println(rev);
            System.out.println(a);
        if(a.equals(rev)){
    System.out.println("Palandrome");
}
        else{
            System.out.println("Not Palandrome");
}
}

@Test
public void rearrangePosNegNumber(){
    int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
    Arrays.sort(arr);
    for(int n=0;n<arr.length;n++){
    System.out.println(arr[n]);
    }
}

@Test
public void removeConsecutiveDuplicate(){
String consig="aabbcdd"; //abcd
   //List<String> c=new ArrayList<>();
   StringBuilder res=new StringBuilder();
   res.append(consig.charAt(0));
   for(int i=1;i<consig.length();i++){

       if(consig.charAt(i)!=consig.charAt(i-1)){
          res.append(consig.charAt(i));
       }
   }
    System.out.println(res);



}

@Test
public void revWordInSentence(){
String Word="My Name iS paran";
String[] word=Word.split(" ");
StringBuilder sb;
  String  revWordInSentence="";
for(String w:word){
   sb= new StringBuilder(w).reverse().append(" ");
    revWordInSentence=revWordInSentence+sb;
}
    System.out.println(revWordInSentence.trim());
}

@Test
public void rotatebyN(){
int[] num={1, 2, 3, 4, 5, 6, 7, 8};
int rotateby=4;
for(int i=0;i<rotateby;i++){
    for(int j=num.length-1;j>0;j--){
        int temp=num[j];
        num[j]=num[j-1];
        num[j-1]=temp;
    }
}
for (int i = 0; i < num.length; i++) {
        System.out.println(num[i]);
    }

}

@Test
public void secondlargestinArray(){
int[] slargest={2,4,7,9,6,1};
int secLarge=Integer.MIN_VALUE;
int firLarge=Integer.MIN_VALUE;
for(int i:slargest){
    if(i>firLarge){
        firLarge=i;
    }
}
    System.out.println(firLarge+" : First Largest Number");
    for(int i:slargest){
        if(i>secLarge && i!=firLarge){
            secLarge=i;
        }
    }
    System.out.println(secLarge+" : Second Largest Number");
}

@Test
public void secondSmallestElementInArray() {
    int[] slargest={2,1,4,7,9,6};
    Arrays.sort(slargest);
    System.out.println(slargest[1]);
}

@Test
public void secondSmallestElementInArrayWithoutSorting(){
    int[] slargest={2,4,7,9,6};
    int secSmall=Integer.MAX_VALUE;
    int firSmall=Integer.MAX_VALUE;
    for(int i:slargest){
        if(i<firSmall){
            firSmall=i;
        }
    }
    System.out.println(firSmall+" : First Smallest Number");
    for(int i:slargest){
        if(i<secSmall && i!=firSmall){
            secSmall=i;
        }
    }
    System.out.println(secSmall+" : Second Smallest Number");

}

@Test
public void segreggatearray(){
       //using List
//    int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };
//    List<Integer> segregated=new ArrayList<>();
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]==0){
//           segregated.add(arr[i]);
//        }
//    }
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]==1){
//            segregated.add(arr[i]);
//        }
//    }
//    System.out.println(segregated);
}

@Test
public void sumUntilSingleDigit(){
//public static int addDigits(int num){
//        if(num<10)
//            return num;
//        int sum=0;
//        while(num>0){
//            int temp=num%10;
//            sum=sum+temp;
//            num=num/10;
//        }
//        return addDigits(sum);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(addDigits(246));
//    }
}



}

package Java_Practise;

import org.testng.annotations.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.testng.annotations.Test;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tutu {
        @Test
        public void anagramProgram() {
//listen ↔ silent -- same letters different order and same length
            String anagramString1 = "listen";
            String anagramString2 = "silent";
            char[] sortedString1=anagramString1.toCharArray();
            char[] sortedString2=anagramString2.toCharArray();
            Arrays.sort(sortedString1);
            Arrays.sort(sortedString2);
                System.out.println(sortedString1);
                System.out.println(sortedString2);
            if(anagramString1.length()==anagramString2.length()){
                if(Arrays.equals(sortedString1,sortedString2)){
                        System.out.println("anagram");
                }else System.out.println("not anagram");
            }
        }

        @Test
        public void commonIntwoArrays() {
            int[] arr1 = {1, 2, 3, 4, 7};
            int[] arr2 = {3, 5, 7, 9};
List<Integer> nonCommon=new ArrayList<>();
Set<Integer> common=new HashSet<>();
for(int i=0;i<arr1.length;i++){
        nonCommon.add(arr1[i]);
}
                for(int i=0;i<arr2.length;i++){
                        if(nonCommon.contains(arr2[i])){
                                common.add(arr2[i]);
                        }
                        else
                        { nonCommon.add(arr2[i]);

                        }
                }
                System.out.println(common);

        }

        @Test
        public void countPair() {
            //For an array of length n,
            // Number of pairs = n × (n - 1) / 2
                int[] arr={1,2,3,4,5,6};
                int n=arr.length;
                int pairs=n*(n-1)/2;
                System.out.println(pairs);

        }

        @Test
        public void countVowels() {
                String str="Hello World";
                int count=0;
                str=str.toLowerCase();
                for(int i=0;i<str.length();i++){
                        char ch=str.charAt(i);
                        if(ch=='a'||ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                                count++;
                        }
                }System.out.println(count);

        }

        @Test
        public void elementStartDecrease() {
                int[] arrnum = {0, 1, 2, 3, 2, 1, 0};
                int descNum = 0;
                for(int i=0;i<arrnum.length-1;i++){
                        if(arrnum[i]>arrnum[i+1]){
                                descNum=arrnum[i];
                                break;
                        }
                }
                System.out.println(descNum);
        }

        @Test
        public void expressionEvaluationRED() {


        }

        @Test
        public void firstandLastOccurance() {
                int arr[] = {1, 2, 2, 2, 2, 1, 4, 7, 8, 8};
                int x = 1;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==x){
                                System.out.println(i+" is the first occurance");
                                break;
                        }
                }
                for(int i=arr.length-1;i>=0;i--){
                        if(arr[i]==x){
                                System.out.println(i+" is the first occurance");
                                break;
                        }
                }

        }

        @Test
        public void firstRepeatingElementInArray() {
                String name="paranjyothin";
for(int i=0;i<name.length()-1;i++){
        for(int j=i+1;j<name.length();j++) {
                if (name.charAt(i) == name.charAt(j)) {
                        System.out.println(name.charAt(j));
                }
        }
}
        }

     //   @Test
      // public void firststrSubsequenceOfsecond() {

       // }

       // private boolean isSubsequenceIgnoreCase(String a, String b) {

       // return false;}

        @Test
        public void maxProductArrayOfposnegInteger() {
                Integer[] arr = {1, 2, 6, 8, 9};
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
                }
                System.out.println(a*b*c+" is max product of theree numbers");
          }

        @Test
        public void mergeTwoSortedArray() {
                int[] arr1 = {1, 2, 3, 4};
                int[] arr2 = { 5, 7, 9};
                List<Integer> mergedArray=new ArrayList<>();
               for(int i=0;i<arr1.length;i++){
                       mergedArray.add(arr1[i]);
               }
                for(int i=0;i<arr2.length;i++){
                        mergedArray.add(arr2[i]);
                }
                System.out.println(mergedArray);
        }

        @Test
        public void pairElements() {
                int[] arr = {1, 5, 7, -1, 5};
                int targetSum = 6;
                for(int i=0;i<arr.length-1;i++){
                        for(int j=i+1;j<arr.length;j++){
                                if(arr[i]+arr[j]==targetSum){
                                        System.out.println("{" + arr[i] + "," + arr[j] + "=" + targetSum + "}");
                                }
                        }
                }
        }

        @Test
        public void palindromeExample() { // rev of wor is same as given word then its palandrome
                String palandromeString = "A man a plan a canal Panama";
                String PString=palandromeString.toLowerCase();
                String rev="";
                PString=PString.replaceAll(" ","");
                for(int i=PString.length()-1;i>=0;i--){
                        rev=rev+PString.charAt(i);
                }
                System.out.println(rev);
                if(PString.equals(rev)){
                        System.out.println("Palandrome");
                }else
                        System.out.println("Not Palandrome");
        }

        @Test
        public void rearrangePosNegNumber() {
                int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
                Arrays.sort(arr);
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }
        }

        @Test
        public void removeConsecutiveDuplicate() {
                String consig = "aabbcdd"; //abcd
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<consig.length()-1;i++){
                        if(consig.charAt(i)!=consig.charAt(i+1)){
                                sb.append(consig.charAt(i));
                        }
                }
                System.out.println(sb);
        }

        @Test
        public void revWordInSentence() {
                String Word = "My Name iS paran";
                String[] words=Word.split(" ");
                String revString="";
                StringBuilder sb;
                for(String w:words){
                        sb=new StringBuilder(w).reverse().append(" ");
                        revString=revString+sb;
                }
                System.out.println(revString.trim());
        }

        @Test
        public void rotatebyN() {
                int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
                int rotateby = 4;
                for(int i=0;i<rotateby;i++){
                        for(int j=num.length-1;j>0;j--){
                              int temp=num[j];
                              num[j]=num[j-1];
                              num[j-1]=temp;
                        }
                }
                for(int i=0;i<num.length;i++){
                        System.out.println(num[i]);
                }

        }

        @Test
        public void secondlargestinArray() {
        int[] arr={1,5,3,7,9,8};
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]>firstLargest){
                        firstLargest=arr[i];
                }
        }
                System.out.println(firstLargest+" is first largest");
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>secondLargest &&arr[i]!=firstLargest){
                                secondLargest=arr[i];
                        }
                }System.out.println(secondLargest+" is second largest");

        }

        @Test
        public void secondSmallestElementInArray() {
                int[] arr={1,5,3,7,9,8};
                Arrays.sort(arr);
                System.out.println("Second smallest element is "+arr[1]);
        }

        @Test
        public void secondSmallestElementInArrayWithoutSorting() {
                int[] arr={1,5,3,7,9,8};
                int firstSmallest=Integer.MAX_VALUE;
                int secondSmallest=Integer.MAX_VALUE;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]<firstSmallest){
                                firstSmallest=arr[i];
                        }
                }
                System.out.println(firstSmallest+" is first smallest");
                for(int i=0;i<arr.length;i++){
                        if(arr[i]<secondSmallest &&arr[i]!=firstSmallest){
                                secondSmallest=arr[i];
                        }
                }System.out.println(secondSmallest+" is second smallest");

        }

        @Test
        public void segreggatearray() {
                int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };
                List<Integer> segregatedArray=new ArrayList<>();
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==0){
                           segregatedArray.add(arr[i]);
                        }
                }
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==1){
                                segregatedArray.add(arr[i]);
                        }
                }
                System.out.println(segregatedArray);
        }

       // @Test
        //public void sumUntilSingleDigit() {
public static int addDigits(int num){
                if(num<10){
                        return num;
                }
                int sum=0;
                while(num>10){
                    int temp =num%10;
                    sum=sum+temp;
                    num=num/10;

                }

                return addDigits(sum);
}
public static void main(String[] args){
        System.out.println(addDigits(385));
}

}

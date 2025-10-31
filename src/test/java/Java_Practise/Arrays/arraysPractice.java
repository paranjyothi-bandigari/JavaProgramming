package Java_Practise.Arrays;

import org.testng.annotations.Test;

import java.util.*;

public class arraysPractice {
    //Reverse an Array

    @Test
    public void revArray(){
        int[] number=new int[5];
        number[0]=1;
        number[2]=2;
        number[3]=3;
        number[4]=4;
        Arrays.sort(number);
       for(int i=number.length-1;i>=0;i--){
           System.out.println(number[i]);
       }
    }
    //Find the Missing Number
    @Test
    public void missingNumberInArray(){
        int[] arr = {2,3,5,6,7,8};
        int missing=0;
for(int i=0;i<arr.length-1;i++){
    if(arr[i+1]!=arr[i]+1){
        System.out.println(arr[i]+1);
            }
        }
    }
    //Find Duplicate Elements
    @Test
    public void duplicateElementsInArray(){
        int[] num={1,5,6,4,1,5};
    Set<Integer> seen=new HashSet<>();
        List<Integer> duplicates=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    duplicates.add(num[i]);
                }
                else
                    seen.add(num[i]);
            }
        }
        System.out.println(duplicates);
    }
    //Merge Two Sorted Arrays
    @Test
    public void sortedArray(){
    int[] s1={1,2,3};
    int[] s2={4,5,6};
    List<Integer> sortedArray=new ArrayList<>();
    for(int sa1:s1){
        sortedArray.add(sa1);
    }
        for(int sa1:s2){
            sortedArray.add(sa1);
        }
        System.out.println(sortedArray);
    }
    //Draw star pyramid using java
    @Test
    public void starPyramid(){
    int row=5;
    for(int i=1;i<=row;i++){
     for(int j=i;j<row;j++) {
         System.out.print(" ");
     }
     for(int k=1;k<=(i*2)-1;k++){
         System.out.print("*");
     }
     System.out.println(" ");
 }

    }
    //Java Array Problem Using Two For Loops




}

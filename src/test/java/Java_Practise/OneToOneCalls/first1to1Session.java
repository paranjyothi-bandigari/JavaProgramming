package Java_Practise.OneToOneCalls;

import java.util.ArrayList;
import java.util.List;

public class first1to1Session {
    public static void main(String[] args) {
        String input="Testing"; // replace T ,t with o
       String ni=input.replace('T','o').replace('t','o');
        System.out.println(ni);
        //input.replaceAll("t","o");
        String newinputt= input.replaceAll("(?i)t","o");
        System.out.println(newinputt);
        String[] fruits={"mango","Apple","orange"};
        String vowelsLetters="aeiou";
        for(String fruit:fruits){

    char fLetter=Character.toLowerCase(fruit.charAt(0));
            if(vowelsLetters.indexOf(fLetter)!=-1){
                System.out.println(fruit+" Started with Vowel");
        }
            else System.out.println(fruit+" not Started  with Vowel");

        }
        String[] fruit = {"mango", "Apple", "orange"};//print a friuit that starts with aeiou and print count
        int count=0;
        List<String> l=new ArrayList<>();
        for(String f:fruit){
            if(f.matches("^[AEIOUaeiou].*")){
                l.add(f);
                count++;
                //System.out.println(f);
            }
        }
        System.out.println(count);
        System.out.println(l);
        String[] newinput=input.split("t");
     for(int i=0;i< newinput.length;i++){
         System.out.println(newinput[i]);
     }



    }
}

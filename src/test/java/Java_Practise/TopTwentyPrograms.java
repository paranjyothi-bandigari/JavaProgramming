package Java_Practise;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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


}

@Test
public void countPair(){


}

@Test
public void countVowels(){
String CountV="PARANJYOTHI";
    Pattern p=Pattern.compile("[AEIOUaeiou]");
    Matcher m=p.matcher(CountV);
   int count=0;
for(int i:CountV.toCharArray()){
    if(m.find()){
        count++;
        //System.out.println(m.group());
    }
}System.out.println(count);
}

@Test
public void elementStartDecrease(){


}

@Test
public void expressionEvaluationRED(){


}

@Test
public void firstandLastOccurance(){


}

@Test
public void firstRepeatingElementInArray(){


}

@Test
public void firststrSubsequenceOfsecond(){


}

@Test
public void maxProductArrayOfposnegInteger(){


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


}

@Test
public void palindromeExample(){ // rev of wor is same as given word then its palandrome
       //A man a plan a canal Panama
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
}else{
    System.out.println("Not Palandrome");
}
}

@Test
public void rearrangePosNegNumber(){


}

@Test
public void removeConsecutiveDuplicate(){


}

@Test
public void revWordInSentence(){
String Word="My Name iS paran";
String[] word=Word.split(" ");
StringBuilder sb=new StringBuilder();
  String  revWordInSentence="";
for(String w:word){
   sb= new StringBuilder(w).reverse().append(" ");
    revWordInSentence=revWordInSentence+sb;
}
    System.out.println(revWordInSentence.trim());
}

@Test
public void rotatebyN(){


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
    int[] slargest={2,4,7,9,6};
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


}

@Test
public void sumUntilSingleDigit(){


}



}

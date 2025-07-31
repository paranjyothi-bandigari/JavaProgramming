package JavaProgramming.Strings;

public class OccuranceofGivenCharacter {
    public static void main(String[] args) {
        String str="Paran";
        char ch='a';
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
              count++;
            }
        }
        System.out.println("Occurance of Given Character a is : " +count);
    }
}

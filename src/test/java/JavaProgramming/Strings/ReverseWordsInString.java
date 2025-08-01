package JavaProgramming.Strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input="Java is best programming language";
        String[] words=input.split(" ");
        String reversed="";
        for(int i=words.length-1;i>=0;i--){
            reversed+=words[i];
            if(i!=0){
                reversed+=" ";
            }
        }
        System.out.println(input);
        System.out.println(reversed);
    }
}

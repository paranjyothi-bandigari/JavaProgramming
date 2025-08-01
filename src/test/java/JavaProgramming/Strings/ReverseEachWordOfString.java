package JavaProgramming.Strings;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String input="Java is best programming language";
        String[] words=input.split(" ");
        String reversed="";
        for(int i=0;i<=words.length-1;i++){
            String word=words[i];
            String revWord="";
            for(int j=word.length()-1;j>=0;j--){
                revWord+=word.charAt(j);
            }
        {
            reversed+=revWord;
            if (i != words.length - 1) {
                reversed += " ";
            }
        }}
        System.out.println(input);
        System.out.println(reversed);
    }
}

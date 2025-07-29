package JavaProgramming.Strings;

public class RevString {
    public static void main(String[] args) {

    String str="Hello World";
    String rev="";
   for(int i=str.length()-1;i>=0;i--){
       System.out.println(str.charAt(i));
       rev=rev+str.charAt(i);
   }
        System.out.println(rev);

    }
}

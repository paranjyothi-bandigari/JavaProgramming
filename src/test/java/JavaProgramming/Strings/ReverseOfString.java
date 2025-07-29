package JavaProgramming.Strings;

public class ReverseOfString {
    public static void main(String[] args) {
        String Str = "Hello World";
        StringBuilder sb=new StringBuilder(Str);
        sb.reverse();
        System.out.println(sb);
    }

}

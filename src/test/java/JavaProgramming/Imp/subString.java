package JavaProgramming.Imp;

public class subString {
    public static void main(String[] args) {
        String s = "Hello, World!";
        String sub = "World";
s.contains(sub);

        System.out.println(s.contains(sub));

        String url = "https://subdomain.example.com";

        int Start=url.indexOf("://")+3;
        int end=url.indexOf(".",Start);
        System.out.println(url.substring(Start,end));



    }
}

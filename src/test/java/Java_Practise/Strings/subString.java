package Java_Practise.Strings;

public class subString {
    public static void main(String[] args) {
        String str="Hello world";
        String substr="world";
        System.out.println(str.contains(substr));

        String s = "Hello, World World";
        String sub = "World";
        int count=0;
        String[] st=s.split(" ");
        for(int i=0;i<st.length;i++){
            if(st[i].contains(sub)){
                count++;
            }
        }
        System.out.println(count);

        String url = "https://subdomain.example.com";
        String start="://";
        String end=".";
        System.out.println(url.indexOf(start));
        System.out.println(url.indexOf(end));


    }
}

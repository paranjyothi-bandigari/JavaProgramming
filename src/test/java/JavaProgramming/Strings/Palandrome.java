package JavaProgramming.Strings;

public class Palandrome {
    public static void main(String[] args) {
        String str="madam";
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("Palandrome");
        }
        else
            System.out.println("not Palandrome");
    }
}

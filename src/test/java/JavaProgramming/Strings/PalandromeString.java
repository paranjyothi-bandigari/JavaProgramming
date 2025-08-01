package JavaProgramming.Strings;

public class PalandromeString {
    public static void main(String[] args) {
        String Pal="Madam";
        StringBuilder rev=new StringBuilder(Pal).reverse();
        if(Pal.equalsIgnoreCase(String.valueOf(rev))){
            System.out.println("Palandrome");
        }
        else
            System.out.println("Not Palandrome");
    }
    }


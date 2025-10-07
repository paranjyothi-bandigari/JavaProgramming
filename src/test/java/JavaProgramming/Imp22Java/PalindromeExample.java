package JavaProgramming.Imp22Java;

public class PalindromeExample {
    public static void main(String[] args) {
        String name="madam";
        String rev=new StringBuilder(name).reverse().toString();
        if(name.equals(rev)){
        System.out.println("Palandrome");}
        else System.out.println("Not Palandrome");

        int num=434;
        int OriginalNum=num;
        int numrev=0;
        while (num>0){
            numrev=numrev*10+num%10;
            num=num/10;
        }
        if(OriginalNum==numrev){
            System.out.println("palindrome");
        }
        else
            System.out.println("not Palindrome");
    }
}

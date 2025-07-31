package JavaProgramming.Strings;

public class CountCapitalSmallLetters {
    public static void main(String[] args) {
        String  str = "Java Programming1%";
        int capital=0;
        int small=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                capital++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                small++;
            }else
                System.out.println("Not capital not small : " +str.charAt(i));
        }
        System.out.println(capital);
        System.out.println(small);
    }

}

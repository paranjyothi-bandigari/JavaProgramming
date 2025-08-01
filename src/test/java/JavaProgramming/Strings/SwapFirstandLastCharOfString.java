package JavaProgramming.Strings;

public class SwapFirstandLastCharOfString {
    public static void main(String[] args) {
        String str="ParaN";
        char firstchar=str.charAt(0);
        char lastchar=str.charAt(str.length()-1);
        String middlechar=str.substring(1,str.length()-1);

        String newStr=lastchar+middlechar+firstchar;
        System.out.println(newStr);


    }
}


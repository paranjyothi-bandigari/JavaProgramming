package JavaProgramming.Strings;

public class ReplaceCharacterInString {
    public static void main(String[] args) {
        String str="This is giil";
        String oldChar="i";
        String newChar="#";

        String newStr=str.replace(oldChar,newChar);
        System.out.println(newStr);
    }
}

package JavaProgramming.Strings;

public class RemoveCharacterfromString {
    public static void main(String[] args) {
        //Write a program to remove the given Character from the given String?
        // Ex: nacre Software  Remove character: a  Output: ncre Softwre
        String str="nacre Software";
        String sb= str.replaceAll("a","");
        System.out.println(sb);

    }
}

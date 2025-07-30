package JavaProgramming.Strings;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String str="  my   name is pa   ran   ";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);
    }
}

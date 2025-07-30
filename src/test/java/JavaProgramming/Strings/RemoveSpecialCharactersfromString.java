package JavaProgramming.Strings;

public class RemoveSpecialCharactersfromString {
    public static void main(String[] args) {
        String str="aB9#fL@3z!Qx*7^mR$2v&Np8Uw";
        String rep=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(rep);
    }
}

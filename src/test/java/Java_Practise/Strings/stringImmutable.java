package Java_Practise.Strings;

public class stringImmutable {
    public static void main(String[] args) {
        String originalString="Hello ";
        System.out.println(originalString);
        System.out.println("********************");

        String modifiedString=originalString.concat("World");
        System.out.println(originalString);
        System.out.println(modifiedString);
    }
}

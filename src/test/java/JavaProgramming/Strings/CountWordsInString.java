package JavaProgramming.Strings;

public class CountWordsInString {
    public static void main(String[] args) {
        String Str="my name is paran jyothi nagarjuna eesha";
        String[] words=Str.split("\\s");
        System.out.println("Words count is : " +words.length);
    }
}

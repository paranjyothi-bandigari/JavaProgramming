package JavaProgramming.Strings;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        String sen="My Name Is Paran Jyothi Nagarjuna Koppala With Loverly Eesha";
        String fl="";
        for(String word:sen.split(" ")){
            fl=fl+word.charAt(0);
        }
        System.out.println(fl);
    }
}

package JavaProgramming.Imp22Java;

public class firststrSubsequenceOfsecond {

    public static void main(String[] args) {
        String str1="AXY";
        String str2="PADXYP";
        boolean result=IsSubString(str1,str2);
        System.out.println("Is str1 a subsequence of str2? " + result);

    }

    private static boolean IsSubString(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length())
        {
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++; }
            else{ j++; }
        }
        if(i==str1.length()){
            return true; }
        else  return false;
    }
}

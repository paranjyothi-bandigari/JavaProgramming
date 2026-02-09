package JavaProgramming.Imp;

public class ReverseANumber {
    public static void main(String[] args) {
        int num=987654321;
        String numstr=String.valueOf(num);
        StringBuilder sb=new StringBuilder(numstr);
        String rev=sb.reverse().toString();
        System.out.println(rev);
//        int rev=0;
//        while (num != 0) {
//            int digit = num % 10;            // get last digit
//            rev = rev * 10 + digit; // add it to reversed
//            num = num / 10;                   // remove last digit
//        }

    }
}

package JavaProgramming.Imp;

public class ReverseANumber {
    public static void main(String[] args) {
        int num=987654321;
        int rev=0;
        while (num != 0) {
            int digit = num % 10;            // get last digit
            rev = rev * 10 + digit; // add it to reversed
            num = num / 10;                   // remove last digit
        }

    }
}

package JavaProgramming.Imp22Java;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stri = sc.nextLine();
        int vowerls = 0;
        for (int i = 0; i < stri.length(); i++) {
            char str=stri.charAt(i);
            if (str == 'a' || str == 'e' || str == 'i' || str == 'o' ||
                    str == 'u' || str == 'A' || str == 'E' || str == 'I'
                    || str == 'O' || str == 'U')
            {
                vowerls++;
            }
        }
        System.out.println("Number of vowels in the string is " + vowerls);
    }
}
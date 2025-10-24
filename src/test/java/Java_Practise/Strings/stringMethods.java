package Java_Practise.Strings;

public class stringMethods {
    public static void main(String[] args) {
        String str="Testing"; //Testing -> T=0;e=1;s=2....g=6
        //charAt()
        System.out.println(str.charAt(2));
        //concat
        System.out.println(str.concat(" Java"));
        //equalsIgnoreCase
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".equals("abc"));
        //replace( , )
        System.out.println("ABC".replace('C','A'));
        //substring()
        // it will print letters from 3rd index till end - le
        System.out.println("Apple".substring(3));
        // it will print letters between 0 index and 3rd index but include 0 index and exclude 3rd index -- APPL(0123)
        System.out.println("APPLE".substring(0,4));
        //toLowerCase, toUpperCase
        System.out.println("ABCDEFGH".toLowerCase());
        System.out.println("abcdefg".toUpperCase());
        //trim() // it will remove end space only not space between words
        System.out.println("abc   ".trim().equals("abc"));
        //index of
        System.out.println("apple".indexOf('l'));
        //to check 2nd P index in apple word
        System.out.println("apoople".indexOf('p',2));

        int index="apoople".indexOf('p');
        System.out.println("apoople".indexOf('p',index+1));

    }

}

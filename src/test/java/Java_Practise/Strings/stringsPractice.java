package Java_Practise.Strings;

public class stringsPractice {
    public static void main(String[] args) {
        String str="testing";
        String str1="testing";
        System.out.println(str==str1); // checks reference
        System.out.println(str.equals(str1)); // checks value


        String strobj=new String("testing");
        String strobj1=new String("testing");
        System.out.println(strobj);
        System.out.println(strobj1==strobj); // checks reference
        System.out.println(strobj.equals(strobj)); // checks value
    }
}

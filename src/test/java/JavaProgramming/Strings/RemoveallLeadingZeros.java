package JavaProgramming.Strings;

public class RemoveallLeadingZeros {
    public static void main(String[] args) {
        String num="000568jjljk";
        String num1=num.replaceAll("^0+(?!$)","");
        System.out.println(num);
        System.out.println(num1);
    }
}

package Java_Practise.Strings;

public class stringBuilder_stringBuffer {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("String ");
        sb.append("Builder");
        System.out.println(sb);

        StringBuffer sbf=new StringBuffer("String ");
        sbf.append("Buffer");
        System.out.println(sbf);
    }
}

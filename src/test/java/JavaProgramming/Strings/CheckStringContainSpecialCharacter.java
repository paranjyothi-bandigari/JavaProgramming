package JavaProgramming.Strings;

public class CheckStringContainSpecialCharacter {
    public static void main(String[] args) {
        String str= "Paran#$%";
        for(int i=0;i<str.length();i++) {
            if (!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))) {
                System.out.println("String Contains Special characters");
                break;
            }

//     if(str.contains("[^A-Za-z0-9]")){
//         System.out.println("String Contains Special characters");
//     }
//        String rep=str.replaceAll("[^A-Za-z0-9]","");
//        System.out.println(rep);
        }
    }
}

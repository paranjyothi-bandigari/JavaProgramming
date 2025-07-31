package JavaProgramming.Strings;


public class CheckStringContainDigits{
//    public static String checkDigit(String str) {
//        for(int i=0;i<str.length();i++) {
//            if(str.charAt(i)>='0' && str.charAt(i)<='9') {
//                return "Given String Contains Digits";    }   }
//        return "Given String not Contains Digits ";  }
//    public static void main(String[] args) {
//       String str="paran123";
//        System.out.println(checkDigit(str));
//          }  }
// {
    public static void main(String[] args) {
        String str="nacre123";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                System.out.println("String have digits ");
                break;
            }
        }

    }
}

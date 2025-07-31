package JavaProgramming.Strings;

public class countCharactersDigitsSpecialChars {
    public static void main(String[] args) {
         String str="abcdef1234@#$";
        int character=0;
        int digits=0;
        int special=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                character++;
            }else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digits++;}
            else{
                special++;
            }   }
        System.out.println(character);
        System.out.println(digits);
        System.out.println(special);
    }
}

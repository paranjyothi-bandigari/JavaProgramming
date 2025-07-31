package JavaProgramming.Strings;

public class countConsonentsVowels {
    public static void main(String[] args) {
        String str="programming";
        int Vowels=0;
        int Consonent=0;
        for(int i=0;i<str.length();i++){
            //int count=0;
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
                    str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                Vowels++;
            }
            else{
                Consonent++;
            }
        }
        System.out.println("Vowels count is : " +Vowels);
        System.out.println("Consonents count is : " +Consonent);
    }
}


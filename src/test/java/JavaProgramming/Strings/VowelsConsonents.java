package JavaProgramming.Strings;

public class VowelsConsonents {
    public static void main(String[] args) {
        String str="programming";
        for(int i=0;i<str.length();i++){
            //int count=0;
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
                    str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                //count++;
                System.out.println(str.charAt(i)+" : Vowel");
            }
            else{
                System.out.println(str.charAt(i)+" : Consonent");
            }
            //System.out.println("vowels count is : "+count);
        }
    }
}

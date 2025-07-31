package JavaProgramming.Strings;

public class PercentageOfVowelsConsonents {
    public static void main(String[] args) {
        String str="mynameisparanjyothieeshanagarjunamynamei";
        int Vowels=0;
        int Consonent=0;
        float length=str.length();
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

        float v=(Vowels/length)*100;
        float c=(Consonent/length)*100;

        System.out.println("Vowels % is : " +v);
        System.out.println("Consonents % is : " +c);

    }

}

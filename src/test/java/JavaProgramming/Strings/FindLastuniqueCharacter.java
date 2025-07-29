package JavaProgramming.Strings;

public class FindLastuniqueCharacter {
    public static void main(String[] args) {
        String str="software services";
        for(int i=str.length()-1;i>=0;i--){
            boolean unique=true;
            for(int j=str.length()-1;j>=0;j--){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    unique=false;
                }
            }
            if(unique){
                System.out.println("Last unique Charater is : " +str.charAt(i));
                break;
            }

        }
    }
}

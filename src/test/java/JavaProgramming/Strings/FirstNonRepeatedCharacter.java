package JavaProgramming.Strings;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str="software services";

        for(int i=0;i<str.length();i++){
            Boolean unique=true;
            for(int j=0;j<str.length();j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                }
            }
                if(unique){
                    System.out.println("the first Uniques character is : "+str.charAt(i));
                    break;

            }
        }


        }
    }


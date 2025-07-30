package JavaProgramming.Strings;

public class HighestOccuranceOfCharacter {
    public static void main(String[] args) {
        String Sent="programmingg";
        char highestOccurance=0;
        int max=0;
        for(int i=0; i<Sent.length();i++){
            char currentChar=Sent.charAt(i);
            int Count=0;
            for(int j=i+1;j<Sent.length();j++){
                if(currentChar==Sent.charAt(j) && i!=j){
                    Count++;
                }
            }
            if(Count>max){
                max=Count;
                highestOccurance=currentChar;
            }
        }
        System.out.println("highestOccurance is : " +highestOccurance);
    }
}

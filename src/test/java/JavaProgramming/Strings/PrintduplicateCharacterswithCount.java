package JavaProgramming.Strings;

public class PrintduplicateCharacterswithCount {
    public static void main(String[] args) {
        String Sent="Programming";
        for(int i=0; i<Sent.length();i++){
            int Count=1;
            for(int j=i+1;j<Sent.length();j++){
                if(Sent.charAt(i)==Sent.charAt(j) && i!=j){
                    Count++;
                }
            }
            if(Count>1){
                System.out.println(Sent.charAt(i)+" : "+Count);
            }
        }

    }
}

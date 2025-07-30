package JavaProgramming.Strings;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        String str="bananas";
        String result="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
               result=result+str.charAt(i);
            }
        } System.out.println(result);
    }
}

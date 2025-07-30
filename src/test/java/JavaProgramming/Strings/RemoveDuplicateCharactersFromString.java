package JavaProgramming.Strings;

public class RemoveDuplicateCharactersFromString {
    public static void main(String[] args) {
        String str="software services";
        String result="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                result=result+str.charAt(i);
            }
        } System.out.println(result);
//        for(int i=0;i<str.length();i++){
//            if(!result.contains(String.valueOf(str.charAt(i)))){
//                result +=String.valueOf(str.charAt(i));
//            }
//        }
        System.out.println(result);
    }
}

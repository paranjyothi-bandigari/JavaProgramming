package JavaProgramming.Imp22Java;

public class RevWordInSentence {
    public static void main(String[] args) {
        String s = "i like this program very much";
        String newS[]=s.split(" ");
        String rev="";
        for(int i=newS.length-1;i>=0;i--){
            rev+=newS[i]+" ";
        }
        System.out.println(rev);
    }
}


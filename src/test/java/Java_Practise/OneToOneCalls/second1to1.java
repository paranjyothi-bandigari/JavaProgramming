package Java_Practise.OneToOneCalls;

public class second1to1 {
    public static void main(String[] args) {
        String s1="I Am a Tester"; //out: I Am
        String[] vowelStart=s1.split(" ");
        int count=0;
        for(String s:vowelStart){
            char a=s.charAt(0);
            if((a=='A'||a=='E'||a=='I'||a=='O'||a=='U') || (s.length()>1)){
                System.out.println(s);
                count++;
            }

        } System.out.println(count);



    }
}

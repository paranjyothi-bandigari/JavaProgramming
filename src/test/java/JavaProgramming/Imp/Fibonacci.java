package JavaProgramming.Imp;

public class Fibonacci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int sum=0;
        int n=6;

        for(int i=0;i<=n;i++){
            sum=first+second;
            System.out.println(first);
            first=second;
            second=sum;
        }
    }
}

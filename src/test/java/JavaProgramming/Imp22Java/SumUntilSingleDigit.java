package JavaProgramming.Imp22Java;

public class SumUntilSingleDigit {
    public static void main(String[] args) {
        //int num=2345;
       int ans= addDigits(2345);
        System.out.println(ans);
    }
    public static int addDigits(int num){
        if(num<10){
        return num;}

        int sum=0;
        while(num>0){
            sum+=num%10; //0+2345%10=
            num/=10; // 2345/10
        }
        return addDigits(sum);
    }
}

package JavaProgramming.Imp22Java;

public class SumUntilSingleDigit {
    public static int addDigits(int num){
    if(num<10)
        return num;
        int sum=0;
    while(num>0){
        int temp=num%10;
        sum=sum+temp;
        num=num/10;
    }
        return addDigits(sum);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(246));
    }
}

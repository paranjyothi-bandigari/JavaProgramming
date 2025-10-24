package Java_Practise;

public class test {
    public static void main(String[] args) {
        System.out.println("My Class");

        test obj=new test(); // creating object to
        obj.add(2,3);
    }

    protected int add(int num1, int num2){
        int sum=num1+num2;
        if(sum%2==0){  //sum%2==0 is logic for even numbers
            System.out.println(sum+ " : sum is even");
        }
        else
            System.out.println(sum+ " : sum is odd");
        System.out.println("sum of numbers is : "+sum);
        return sum;
    }

}

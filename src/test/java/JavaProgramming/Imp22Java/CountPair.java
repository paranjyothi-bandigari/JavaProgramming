package JavaProgramming.Imp22Java;

public class CountPair {
    public static void main(String[] args) {
       //For an array of length n,
        //👉 Number of pairs = n × (n - 1) / 2
        int[] arr= {1,2,3,4,5,6};
        int count=0;

        int n=arr.length;
        count=n*(n-1)/2;
        System.out.println(count);
    }
}

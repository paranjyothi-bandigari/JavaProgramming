package JavaProgramming.Imp22Java;

public class CountPair {
    public static void main(String[] args) {
        Integer[] arr= {1,2,3,4,5};
        Integer count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                count=count++;

            }
        }
        //System.out.println(count);
    }
}

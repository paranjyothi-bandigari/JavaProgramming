package JavaProgramming.Imp22Java;

public class pairElements {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;
        findAndPrintPair(arr,targetSum);
    }

    private static void findAndPrintPair(int[] arr, int targetSum) {
        System.out.println("Pairs with sum " + targetSum + ":");
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==targetSum){
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    }
}

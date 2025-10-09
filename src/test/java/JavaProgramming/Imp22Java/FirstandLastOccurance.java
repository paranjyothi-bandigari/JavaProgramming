package JavaProgramming.Imp22Java;

public class FirstandLastOccurance {
    // Function for finding first and last occurrence
    // of an elements

    public static void main(String[] args) {
        int arr[]={1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 };
        int value=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println("First Occurance of 2 is : " +i);
           break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==value){
                System.out.println("Last Occurance of 2 is : " +i);
                break;
            }
        }

    }
}

package JavaProgramming.Imp22Java;

import java.util.LinkedList;

public class segreggatearray {

    public static void main(String[] args) {
        int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };

        LinkedList li=new LinkedList();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                li.addFirst(arr[i]);
            }
            else{
                li.addLast(arr[i]);
            }
        }
        System.out.println(li);

    }
}

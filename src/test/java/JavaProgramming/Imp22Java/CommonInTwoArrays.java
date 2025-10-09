package JavaProgramming.Imp22Java;


import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 6, 3, 4, 5 };
        int b[] = { 2, 4, 3, 1, 0 };
        Set<Integer> common=new HashSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    common.add(a[i]);
                    break;
                }
            }
        }
        System.out.println(common);
    }
}

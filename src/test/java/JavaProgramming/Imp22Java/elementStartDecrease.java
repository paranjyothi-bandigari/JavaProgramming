package JavaProgramming.Imp22Java;
//The code tries to find the index where the array stops increasing
// and starts decreasing — basically the peak point.
public class elementStartDecrease {
    public static void main(String[] args) {
        int[] arrnum={0,1,2,3,2,1,0};
        int midnum=0;
        for(int i=0;i<arrnum.length-1;i++){
            if(arrnum[i]>arrnum[i+1]){
                midnum=i;
                break;
            }
        }
        System.out.println(midnum);
    }
}

package JavaProgramming.Imp22Java;

public class maxProductArrayOfposnegInteger {
    public static void main(String[] args) {
        Integer[] arr= {1,2,6,8};
        int a=arr[0],b=arr[1],c=arr[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){

                if(arr[i]*arr[j]*arr[k]>a*b*b){
                    a=arr[i];
                    b=arr[j];
                    c=arr[k];
                }
            }
            }
        }
        System.out.println(a+","+b+","+c+" Product is : "+a*b*c);
    }
}

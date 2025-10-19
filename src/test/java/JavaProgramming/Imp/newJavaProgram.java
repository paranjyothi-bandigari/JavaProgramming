package JavaProgramming.Imp;

import java.util.Arrays;

public class newJavaProgram {
  public static void main(String[] args) {
    int arraynum[]={5,8,1,2,3,4};
   // Arrays.sort(arraynum);
   // System.out.println(arraynum[1]);
    int lowest=arraynum[0];
    int seclowest=arraynum[1];
    for(int i=0;i<arraynum.length;i++){
      if(lowest>arraynum[i]){
        lowest=arraynum[i];
        System.out.println("Lowest number is : "+lowest);
      }
    }
    for(int i=0;i<arraynum.length;i++){
      if(seclowest>arraynum[i] && arraynum[i]!=lowest){
        seclowest=arraynum[i];
        System.out.println("Second Lowest Number is : " +seclowest);

      }
    }

  }

}

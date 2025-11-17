package Java_Practise;

public class second1to1Session {
    public static void main(String[] args) {
        String input="Testing"; // replace T ,t with o
       String ni=input.replace('T','o').replace('t','o');
        System.out.println(ni);
        //input.replaceAll("t","o");
        String newinputt= input.replaceAll("(?i)t","o");
        System.out.println(newinputt);
        String[] fruits={"mango","Apple","orange"};
        String[] vowelsLetters={"A","E","I","O","U"};
        for(String fruit:fruits){
for(String vo:vowelsLetters){
            if(fruit.toUpperCase().startsWith(vo)){
                System.out.println(fruit+" Started with Vowel");
            }
        }}
        String[] newinput=input.split("t");
     for(int i=0;i< newinput.length;i++){
         System.out.println(newinput[i]);
     }



    }
}

package Java_Practise.OneToOneCalls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arrayPractice {
    public static void main(String[] args) {
        String[] str=new String[4]; // while declaring we have to give from 1
        str[0]="aaa";
        str[1]="ww";
        str[2]="aaeea";
        str[3]="addaa";
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

//list cannot create obj, class we can create obj
        //diff belw arraylist and linked list
        List<String> strr=new ArrayList<>();
        List<String> strre=new LinkedList<>();




    }
}

package Java_Practise;

import java.util.HashMap;
import java.util.Map;

public class testClass009 {
    public static void main(String[] args) {
        Map<String,Integer> sortMap=new HashMap<>();
        sortMap.put("apple",3);
        sortMap.put("mango",2);
        sortMap.put("banana",4);
        sortMap.put("grapes",12);
        sortMap.put("orange",1);

        sortMap.entrySet().stream().sorted(Map.Entry.comparingByValue());

        for(Map.Entry<String,Integer> entry:sortMap.entrySet()){
            System.out.println(entry.getValue()+" : "+entry.getKey());
        }

    }
}

package JavaProgramming.Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps_ConditionValue {
    public static void main(String[] args) {
        Map<String, Integer> studentScore=new HashMap<>();
        studentScore.put("John", 85);
        studentScore.put("Emily", 92);
        studentScore.put("Michael", 78);
        studentScore.put("Jessica", 95);
        System.out.println(studentScore);

        for(Map.Entry<String, Integer> entry:studentScore.entrySet()){

            if(entry.getValue()<90){
                entry.setValue(96);
                System.out.println(entry.getKey()+" :" +entry.getValue());
            }
        }}
}
package JavaProgramming.Collections;

import java.util.HashMap;
import java.util.Map;

public class ValueSet {
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();
        studentScore.put("John", 85);
        studentScore.put("Emily", 92);
        studentScore.put("Michael", 78);
        studentScore.put("Jessica", 95);
        System.out.println(studentScore);

        for(Integer values:studentScore.values()){
            System.out.println(values);
        }

    }
}


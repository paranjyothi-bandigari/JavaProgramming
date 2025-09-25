package JavaProgramming.Collections;

import java.util.HashMap;
import java.util.Map;

public class KeySet {
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();
        studentScore.put("John", 85);
        studentScore.put("Emily", 92);
        studentScore.put("Michael", 78);
        studentScore.put("Jessica", 95);
        System.out.println(studentScore);

        for(String keys:studentScore.keySet()){
            System.out.println(keys);
        }

    }
}

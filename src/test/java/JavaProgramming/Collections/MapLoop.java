package JavaProgramming.Collections;
import java.util.Map;
import java.util.HashMap;

public class MapLoop {
    public static void main(String[] args) {
        Map<String, Integer> studentScore=new HashMap<>();
        studentScore.put("John", 85);
        studentScore.put("Emily", 92);
        studentScore.put("Michael", 78);
        studentScore.put("Jessica", 95);

        System.out.println(studentScore);

    }
}

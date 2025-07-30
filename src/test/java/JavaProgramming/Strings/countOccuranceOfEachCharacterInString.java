package JavaProgramming.Strings;
import java.util.HashMap;
import java.util.Map;

public class countOccuranceOfEachCharacterInString {
    public static void main(String[] args) {
        String str="bananas";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: map.keySet()){
            System.out.println(c+" "+map.get(c));
        }
    }
}

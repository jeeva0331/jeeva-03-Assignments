import java.util.*;

class Main {
    public static void main(String[] args) {
        
        String str = "aabbc";
        
        // Create Map
        Map<Character, Integer> map = new HashMap<>();
        
        // Loop through string
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Print result
            System.out.println(map);
    }
}

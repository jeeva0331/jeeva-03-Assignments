import java.util.*;

class Main {
    public static void main(String[] args) {
        
  
  Map<Integer,Integer> system = new HashMap<>();
  system.put(1,10000);
  system.put(2,20000);
  system.put(3,15000);
  
 
  System.out.println(system.get(2));
  system.put(2,30000);
  
  System.out.println(system);
  int missingId=10;
 if (system.containsKey(missingId)) {
      System.out.println(system.get(missingId));
        } else {
            System.out.println("Employee ID " + missingId + " not found");
        }
  
    }   
}

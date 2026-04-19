import java.util.*;

class Main {
    public static void main(String[] args) {
        
  int N=10;
  int [] arr={1,2,4,6,7,9};
  Set<Integer> set = new HashSet<>();
  for(int num :arr){
      set.add(num);
  }
  System.out.print("Missing numbers = " );
  for(int i=1;i<=N;i++){
  if(!set.contains(i)){
     System.out.print( i +" "); 
  }
    
    }
    }   
}

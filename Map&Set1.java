import java.util.*;

class Main{
    public static void main(String[] agrs){
        Set<String> email=new LinkedHashSet<>();
        email.add("a@gmail.com");
        email.add("b@gmail.com");
        email.add("a@gmail.com");
         email.add("c@gmail.com"); 
         email.add("d@gmail.com"); 
         email.add("e@gmail.com");
       
        System.out.println(email);
        
    }
}

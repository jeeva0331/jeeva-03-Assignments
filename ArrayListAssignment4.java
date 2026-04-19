package Assignment;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


public class AssignmentArrayList4 {
	
	    public static void main(String[] args) {
	    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(100,250,30,50,500));
	    
	Collections.sort(list);
	int secondlargest=list.get(list.size()-2);
	System.out.println("secondlargest = " +  secondlargest);
	
}
}

package JavaLearn.JavaLearn;

import java.util.ArrayList;
import java.util.List;

import edu.emory.mathcs.backport.java.util.Collections;

import java.util.Arrays;


public class badNumberProblem {
	
	
	public static void main(String args[]) {
		
		List<Integer> badnumbers=Arrays.asList(20,1,4,15,25,30,49,100);
		
		MaxDiff(badnumbers,1,101);
	}

	private static void MaxDiff(List<Integer> badnumbers, int p, int q) {
		Collections.sort(badnumbers);
		System.out.println(badnumbers);
		List<Integer> temp=new ArrayList<Integer>(); 
			int start=p;
			int a=0;
			for(int i=0; i<badnumbers.size();i++) {
				if(badnumbers.get(i)>p) {
					if(badnumbers.get(i)<q) { 
					a=(badnumbers.get(i)-1)-start;
					temp.add(a);
					start=badnumbers.get(i)+1;
					
					}
					else {
						a=q-start;
						temp.add(a);
						break;
					}
					
				} 

			}
			System.out.println(temp);
			
		}
		
	
	
}

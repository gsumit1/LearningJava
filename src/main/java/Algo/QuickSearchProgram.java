package Algo;

import java.util.Arrays;
public class QuickSearchProgram {
	
	
	public static void main(String args[]) {
		
		int[] a= {12,13,24,10,3,6,90,70};
		
	
		System.out.println(Arrays.toString(getPartition(a, 0, a.length-1)));
	}
	
	
	static int[] getPartition(int [] a, int start, int end){
		int i=start;
		int j=end;
		int pivot=a[start];		
		while(i<j) {
		
		while(a[i]<=pivot) {
			
			if(i==end) {break;}
			i++;
		} 
		
		while(a[j]>=pivot) {
			
			if(j==start) { break;}
			j--;
		}
		
		if(i<j) {
			swap(a,i,j);
			i++;
			j--;
		} 
		}
		swap(a,start,j);
        if (start < j){
        	getPartition(a, start, j);
        }
        if (end > i){
        	getPartition(a, i, end);
        }
		return a;
	}
	static void swap(int[] a, int i, int j) {
		int temp=a[i];		
		a[i]=a[j];
		a[j]=temp;
	}
}

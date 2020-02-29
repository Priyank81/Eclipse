package recursion;

public class BinaryRecurSort {
	
	public static boolean match(int[] d,int val,int low,int high) {
		
		if (low> high) return false;
		
		int mid = (low+high)/2;
				
		if(val==d[mid])	return true;
		
		System.out.println(d[mid]);
		
		if(val<d[mid])	return match(d, val, low, (mid-1));
		
		else return match(d,val, mid+1, high);
			
	}
	
	
	
	
	public static void main (String [] args) {
		
		int [] a = {1,2,3,4,5,6,7,10,11,23,34,45,46,47,55,57};
		
		System.out.println(a.length);
		System.out.println(match(a, 12, 0, a.length));
			
	}

}

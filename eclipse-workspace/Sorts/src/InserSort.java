
public class InserSort {
	
	public static void insertionSort(char [] d) {
		int n= d.length;
		
		for(int k=1; k<n; k++) {
			//code to iterate along the array
			int j=k;
			char cur = d[k];
			
			// block compares the element at index and keeps shifting index left till
			// element's value is less
		while(cur<d[j-1]) {
				d[j]= d[j-1];
				j--;
			}
		//putting the element at the new index (smallest in start)
			d[j]=cur;
		}
	
	}
	
	public static void main(String[] args) {
		char a []= {'A','C','D','G','B','E','F'};
		
		insertionSort(a);
		
		System.out.println(a.length);
		System.out.println(a);
		
	}

}

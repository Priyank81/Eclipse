public class HeapSort {
	
	public static void main (String[] args) {
		int a[] = {0,12,3,10,22,14,9,30, 2, 33};
		int n=a.length;
		
		sort(a,n);
		
		for(int i : a) {
			System.out.print(i+" -");
		}
		
	}
	
	static void sort(int a[], int n) {
		
		//heapify of the array
		for(int i=(n/2)-1; i>=0; i--) {
			heapify(a,n, i);
		}
		
		// code to delete root and then heapify. store root at the end
		for(int i=n-1; i>=0; i--) { //root is put to last node
			int temp = a[0];
			a[0]= a[i];
			a[i] = temp;
			
			heapify(a, i, 0);
	}
		
		
	}
	
	static void heapify(int a[], int n, int i) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left < n && a[left]>a[largest]) {
			largest = left;
		}
		if(right<n && a[right]>a[largest]) {
			largest= right;
		}
		
		if(largest!=i) {
			int swap = a[i];
			a[i] = a[largest];
			a[largest] = swap;
			
			//recusrively heapify the subtree
			heapify(a, n, largest);
		}
		
	}

}

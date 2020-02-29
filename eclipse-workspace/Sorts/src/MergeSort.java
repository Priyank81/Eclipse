
public class MergeSort {
	

	
	public static void main(String[] args) {
		int arr[]= {4,3,5,10,11,15,9,12};

		int low= 0;
		int high= arr.length-1;
		mergesort(arr, low, high);
		
		for(int i: arr) {
			System.out.print(i+"--");
		}

	}
	
	static void mergesort(int arr[], int l, int h) {
		if(l<h) {
			int mid= (l+h)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}

	static void merge(int[] arr, int l, int mid, int h) {
		int temp[] =new int[h-l+1];
		int i=l, j=mid+1, k=0;
		
		while(i<=mid && j<=h) {
			if(arr[i]<=arr[j]) {
				temp[k]= arr[i];
				i++;
			} else {
				temp[k]= arr[j];
				j++;
			}
		k++;	
		}
		while(i<=mid) {
			temp[k]=arr[i];
			k++; i++;
		}
		while(j<=h) {
			temp[k]= arr[j];
			k++; j++;
		}
		
		for(i= l; i<=h; i++) {
			arr[i]= temp[i-l];
		}
	}

}

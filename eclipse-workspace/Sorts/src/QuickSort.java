
public class QuickSort {

	public static void main(String[] args) {
		 int arr[]= {7,3,10,9,8,22,3};
		int high= arr.length-1;
		int low=0;
		
		arr = quicksort(arr,low,high);
		for(int p:arr) {
			System.out.print(p+"--");
		}
		
	}
	
	static int[] quicksort(int arr[],int l, int h) {
		if(l<h-1) {
			System.out.println("q");
			int x= partition(arr, l,h);
			quicksort(arr,l,x);
			quicksort(arr,x+1,h);
			System.out.println("t");
		}
		return arr;
	}
		
	static int partition (int ar[],int l,int h){
		int i=l, j=h;
			int pivot= ar[i];
			while(i<j) {
				while(ar[i]<=pivot) {
					i++;
				}
				while(ar[j]>pivot) {
					j--;
				}
				if(i<j) {
					int temp= ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				System.out.println("you");
			}
			System.out.println("me");
			int temp= ar[l];
			ar[l]=ar[j];
			ar[j]=temp;
			
			return j;
		}
		

	
}


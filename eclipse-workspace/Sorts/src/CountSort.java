
public class CountSort {

	public static void main(String[] args) {
		
		int arr[] = {1,3,3,5,5,6,6,4,4,2,9};
		int m = 9+1;//because range if from 0-9 that is total10
		int n= arr.length;
		
		int c[] = new int[m];
		int out[] = new int[n];
		
		for(int i=0; i<m;i++) {
			c[i]=0;
		}
		for(int j=0; j<n;j++) {
			out[j]=0;
		}
		
		for(int i= 0; i<n; i++) {
			c[arr[i]]+=1;
		}
		
		for(int i=1; i<m; i++) {
			c[i] += c[i-1];
		}
		
		for(int i=n-1; i>=0; i--) {
			out[c[arr[i]]-1] = arr[i];
			--c[arr[i]];
		}
		
		for(int i: out) {
			System.out.println(i+"--");
		}
	}

}

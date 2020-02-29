
public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[] = {1,2,15,4,12,10,3,19,20,22,23,24};
		
		bubble(arr);
		for(int p:arr) {
			System.out.print(p+"--");
		}
	}

	static void bubble (int a[]) {
		int  n= a.length;
		for(int i=0;i<n-1;i++) {
			int flag=0;
			System.out.println("pas:"+ i);
			for(int j=0; j<n-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					flag =1;
				}
			}if (flag==0){ break;}
		}
	}
}

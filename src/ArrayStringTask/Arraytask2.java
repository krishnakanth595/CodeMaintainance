package ArrayStringTask;

public class Arraytask2 {
	public static void getNumbers(int[] arr) {
		int b=arr[0],s=arr[0];		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>b) {
				b=arr[i];
			}
			if(arr[i]<s) {
				s=arr[i];
			}
		}
		System.out.println("Biggest number in array is: "+b);
		System.out.println("Smallest number in array is: "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,15,6,7,3,9};
		getNumbers(arr);
	}
}

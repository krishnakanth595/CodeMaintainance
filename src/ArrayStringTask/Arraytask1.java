package ArrayStringTask;

public class Arraytask1 {

	public static void missingNumber(int[] arr) {
		
		int sum = 0;
		int idx = -1;
		for (int i = 0; i < arr.length; i++)
		{
		    if (arr[i] == 0)
		    {
		         idx = i; 
		    }
		    else 
		    {
		         sum += arr[i];
		    }
		}

		// the total sum of numbers between 1 and arr.length.
		int total = (arr.length + 1) * arr.length / 2;

		System.out.println("missing number is: " + (total - sum) + " at index " + idx);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		for(int i=1;i<=10;i++) {
			a[i-1]=i;
		}	
		a[7]=0;
		missingNumber(a);
	}

}

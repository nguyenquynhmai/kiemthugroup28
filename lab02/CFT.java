import java.math.*;
public class CFT {
	
	public static int[] sort(int a[]){
		int temp;
		for( int i = 0; i < a.length; i++)
			for(int j = 0; j < a.length; j++)
				if(a[j] < a[i]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		
		return a;
	}

	public static void main(String[] args) {
		
		int[] m = {1,5,0,4,8,9};
		int[] result = sort(m);
		for( int i = 0; i < result.length; i++)
			System.out.println(result[i]);
		int maxArray = result[0];
		System.out.print(maxArray);

	}

}

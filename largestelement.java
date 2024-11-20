package firstproject;

public class largestelement {

	public static void main(String[] args) {
		int [] arr =new int [] {11,2,4,7,9}; //initialize array
		int max=arr[0];//first element of array
		for (int i=0;i<arr.length; i++)//loop
		{
			if(arr[i]>max) //compare element of array with max
				max=arr[i];
		}
		System.out.println("Largest element array=" + max);

	}

}
/*output:
 Largest element array=9*/

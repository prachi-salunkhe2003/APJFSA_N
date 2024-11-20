package firstproject;

public class smallestelement {

	public static void main(String[] args) {
		
				int [] arr =new int [] {1,2,4,7,9};   //initialize array
				int min=arr[0]; //first element of array
				for (int i=0;i<arr.length; i++) //loop
				{
					if(arr[i]<min) //compare element of array with min
						min=arr[i];
				}
				System.out.println("Smallest element array=" + min);

			}

		}

/*output:
   Smallest element array=1*/


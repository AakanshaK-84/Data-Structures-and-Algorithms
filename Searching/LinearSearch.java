import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched :");
		int search=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				System.out.println(search+" found at index "+i);
				break;
			}
		}
	}
}

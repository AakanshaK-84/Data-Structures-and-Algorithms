import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target :");
		int target=sc.nextInt();
		System.out.println("Binary Search");
		int start=0,end=arr.length-1;
		int index=-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(target>arr[mid]){
				start=mid+1;
			}
			else if(target<arr[mid]){
				end=mid-1;
			}
			else{
				index=mid;
				break;
			}
		}
			if(index!=-1){
				System.out.println("Element found at index :"+index);
			}else{
				System.out.println("Element not found");
			}
		
	}
}


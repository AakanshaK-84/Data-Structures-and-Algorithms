import java.util.*;
class BinaryRecursion{
	static int BinaryRecursion(int start,int end,int arr[],int target,int index){
		while(start<=end){
			int mid=start+(end-start)/2;
                        if(target>arr[mid]){
                                return BinaryRecursion(start+1,end,arr,target,index);
                        }
                        else if(target<arr[mid]){
                                return BinaryRecursion(start,mid-1,arr,target,index);
                        }
                        else{
                                index=mid;
                                break;
                        }
		}
		return index;
			
	}
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
                int index=-1,result;
		result=BinaryRecursion(start,end,arr,target,index);
		if(result!=-1){
                                System.out.println("Element found at index :"+result);
                        }else{
                                System.out.println("Element not found");
                        }	
	}
}

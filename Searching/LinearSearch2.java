import java.util.*;
class LinearSearch2{
	static int LinearRecursion(int arr[],int start,int search,int index){
		if(start>=arr.length){
			return index;
		}
		if(arr[start]==search){
			index=start;
		}
		return LinearRecursion(arr,start+1,search,index);

	}
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
		int start=0;
		int result=LinearRecursion(arr,start,search,-1);
		if(result!=-1){
			System.out.println(search+" found at index "+result);
		}else{
			System.out.println("Element Not found");
		}
        }
}

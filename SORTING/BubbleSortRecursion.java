import java.util.*;
class BubbleSortRecursion{
	static void BubbleSort(int arr[],int size){
		if(size==1){
			return;
		}
		for(int j=0;j<size-1;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		BubbleSort(arr,size-1);
	}
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size :");
                int size = sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter array elements :");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		BubbleSort(arr,size);
		System.out.println("Sorted array using Recursion :");
		for(int i=0;i<arr.length;i++){                                                                                                                                      System.out.print(arr[i]+" ");
	       	}
	}
}

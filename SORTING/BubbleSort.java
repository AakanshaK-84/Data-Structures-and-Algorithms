/* Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. This process continues until the array is sorted.
	Steps of Bubble Sort:
	1] Start from the first element.
	2] Compare it with the next element.
	3] If the current element is greater, swap them.
	4] Move to the next pair and repeat Step 3.
	5] After each full pass, the largest element "bubbles up" to the end.
	6] Repeat the process for the remaining unsorted part of the array.
	7] Continue until no swaps are needed (array is sorted).

*/
import java.util.*;
class BubbleSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		boolean swapped=false;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				count++;
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
		}
		if(swapped==false){
			System.out.println("Array is already sorted :");
			System.out.println("Number of iterations are :"+count);
		}else{
		System.out.println("Sorted array using bubble sort is :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("Number of iterations are :"+count);
		}
	}
}


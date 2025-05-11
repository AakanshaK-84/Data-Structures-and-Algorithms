import java.util.*;
class NumberSum{
	static int Sum(int num){
        	if(num==1){
                	return 1;
        	}
        	return num+Sum(num-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int sum=Sum(num);
		System.out.println("Sum of "+num+" is "+sum);
	}
}

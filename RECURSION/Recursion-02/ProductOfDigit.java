import java.util.*;
class ProductOfDigits{
	static int ProductOfNumber(int num){
		if(num==0){
			return 1;
		}
		return num%10*ProductOfNumber(num/10);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int product=ProductOfNumber(num);
		System.out.println("Product of digits in number "+num+" is "+product);
	}
}

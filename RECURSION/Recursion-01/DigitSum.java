import java.util.*;
class DigitSum{
	static int DigitsSum(int num){
		if(num==0){
			return 0;
		}
		int digit=num%10;
		return digit+DigitsSum(num/10);
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int sum=DigitsSum(num);
		System.out.println("Sum of digits of given integer is "+sum);
	}
}


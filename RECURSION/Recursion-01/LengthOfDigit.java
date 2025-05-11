import java.util.*;
class LengthOfDigits{
	static int CalculateLength(int num){
		if(num==0){
			return 0;
		}
		return 1+CalculateLength(num/10);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int length=CalculateLength(num);
		System.out.println("Length of the number is :"+length);
	}
}

import java.util.*;
class StrongNo{
        static int StrongNum(int num){
                if(num==0){
                        return 0;
                }
		int digit=num%10;
                return Factorial(digit)+StrongNum(num/10);
        }
	static int Factorial(int digit){
		if(digit==0){
			return 0;
		}
		if(digit==1){
			return 1;
		}
		return digit*Factorial(--digit);
	}
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number :");
                int num=sc.nextInt();
                int fact_sum=StrongNum(num);
		if(num==fact_sum){
			System.out.println(num+" is a Strong number.");
		}else{
			System.out.println(num+" is not a Strong number.");
		}
        }
}

import java.util.*;
class PrimeNo{
	static int CheckPrime(int num,int start){         
		if(start>num){
			return 0;
		}
		if(num%start==0){
			return 1+CheckPrime(num,start+1);
		}else{
			 return CheckPrime(num,start+1);
		}

	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		System.out.println("Result using normal for loop :");
		if(count==2){
			System.out.println("Number is a prime");
		}else{
			System.out.println("Number is not a prime");
		}
		System.out.println("Result using RECURSION :");
		int result=CheckPrime(num,1);
		if(result==2){
                        System.out.println("Number is a prime");
                }else{
                        System.out.println("Number is not a prime");
                }
	}
}

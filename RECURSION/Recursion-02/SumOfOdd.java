import java.util.*;
class SumOfOdd{
        static int OddDigitSum(int num){
                if(num==0){
                        return 0;
                }
                if((num%10)%2==1){
                        return num%10+OddDigitSum(num/10);
                }
		return OddDigitSum(num/10);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number :");
                int num=sc.nextInt();
                int odd_sum=OddDigitSum(num);
                System.out.println("Odd Sum of digits in number "+num+" is "+odd_sum);
        }
}

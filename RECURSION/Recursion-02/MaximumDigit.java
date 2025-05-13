import java.util.*;
class MaximumDigit{
        static int MaxDigit(int num,int max){
                if(num==0){
                        return max;
                }
		if(num%10>max){
			max=num%10;
		}
                return MaxDigit(num/10,max);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number :");
                int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
                int max_num=MaxDigit(num,max);
                System.out.println("Maximum digit in number "+num+" is "+max_num);
        }
}

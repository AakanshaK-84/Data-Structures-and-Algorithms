import java.util.*;
class OddNumSum{
        static int OddNumSum(int num,int start){
                if(start>num){
                        return 0;
                }
                if(start%2==1){
                        return start+OddNumSum(num,++start);
                }
                return OddNumSum(num,++start);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number :");
                int num=sc.nextInt();
                int odd_sum=OddNumSum(num,1);
                System.out.println("Odd Sum of numbers upto given number "+num+" is "+odd_sum);
        }
}

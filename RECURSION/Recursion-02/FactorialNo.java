import java.util.*;
class FactorialNo{
        static int Nfactorial(int num){
                if(num==1){
                        return 1;
                }
                return num*Nfactorial(--num);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter number :");
                int num=sc.nextInt();
                int fact=Nfactorial(num);
                System.out.println("Factorial of "+num+" is "+fact);
        }
}

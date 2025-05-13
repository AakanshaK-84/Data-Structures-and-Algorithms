import java.util.*;
class PalindromeNo{
        static int CheckPalindrome(int num,int rev){
                if(num==0){
                        return rev;
                }
                int digit=num%10;
                rev=digit+rev*10;
                return CheckPalindrome(num/10,rev);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number :");
                int num=sc.nextInt();
                int checknum=num, num1=num;
                int rev=0;
                while(checknum>0){
                        int digit=checknum%10;
                        rev=digit+rev*10;
                        checknum=checknum/10;
                }
                System.out.println("Palindrome Check using while loop :");
                if(num==rev){
                        System.out.println("Given number is a palindrome");
                }else{
                        System.out.println("Given number is not a palindrome");
                }
                System.out.println("Palindrome Check using Recursion:");
                int result=CheckPalindrome(num,0);
                if(num1==result){
                        System.out.println("Given number is a palindrome");
                }else{
                        System.out.println("Given number is not a palindrome");
                }
        }
}

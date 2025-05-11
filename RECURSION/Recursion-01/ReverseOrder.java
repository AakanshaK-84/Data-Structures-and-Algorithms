import java.util.*;
class ReverseOrder{
        static void NumberPrint(int num){
                if(num==0){
                        return;
                }
                System.out.print(num+" ");
                NumberPrint(--num);
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto which we have to reverse the numbers :");
                int num=sc.nextInt();
                NumberPrint(num);
        }
}

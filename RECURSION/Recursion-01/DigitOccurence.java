import java.util.*;
class DigitOccurrence{
        static int DigitsOccur(int num,int key){
                if(num==0){
                        return 0;
                }
                int digit=num%10;
		if(digit==key){
			return 1+DigitsOccur(num/10,key);
		}else{
			return DigitsOccur(num/10,key);
		}
        }
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the number :");
                int num=sc.nextInt();
		System.out.println("Enter key to be searched :");
                int key=sc.nextInt();
		int occurence=DigitsOccur(num,key);
                System.out.println("Count of "+key+" digit in given integer is "+occurence);
        }
}

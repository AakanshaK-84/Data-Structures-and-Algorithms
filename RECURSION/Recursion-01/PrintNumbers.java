import java.util.*;
class PrintNumbers{
	static void NumberPrint(int start,int num){
		if(start==num+1){
			return;
		}
		System.out.print(start+" ");
		NumberPrint(++start,num);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int start=1;
		NumberPrint(start,num);
	}
}

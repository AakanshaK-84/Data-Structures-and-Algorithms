import java.util.*;
class ReverseString{
	static String StringReverse(String str,int length,String reverse){
		if(length<0){
			return reverse;
		}
		reverse=reverse+str.charAt(length);
		return StringReverse(str,length-1,reverse);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		String reversed="";
		System.out.println("Reverse String using for loop :");
		for(int i=str.length()-1;i>=0;i--){
			reversed=reversed+str.charAt(i);
		}
		System.out.println("Reversed String is :"+reversed);
		System.out.println("Reverse String using Recursion :");
		String reverse="";
		String result=StringReverse(str,str.length()-1,reverse);
		System.out.println("Reversed String is :"+result);
	}
}

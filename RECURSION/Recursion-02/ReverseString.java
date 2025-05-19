import java.util.*;
class ReverseString{
	static String StringRev(String str,int start,int end,String rev){
		if(end<0){
			return rev;
		}
		rev=rev+str.charAt(end);
		return StringRev(str,start,--end,rev);

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		String newStr="";
		for(int i=str.length()-1;i>=0;i--){
			newStr=newStr+str.charAt(i);
		}
		System.out.println("Reversed String is : "+newStr);
		System.out.println("Reverse String using character array ");
		char charArr[]=str.toCharArray();
		int end=charArr.length;
		for(int i=0;i<charArr.length/2;i++){
			char temp=charArr[i];
			charArr[i]=charArr[end-(i+1)];
			charArr[end-(i+1)]=temp;
		}
		System.out.println(charArr);
		System.out.println("Reversed String using Recursion ");
		String rev=StringRev(str,0,str.length()-1,"");
		System.out.println("Reversed String is : "+rev);
	}
}


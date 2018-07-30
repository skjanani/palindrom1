package janani;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
int i,l;
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.nextLine();
String a="";
String b="";
l=str.length();
for(i=0;i<l;i++){
	a=a+str.substring(i,i+1);
}
for(i=l-1;i>=0;i--){
	b=b+str.substring(i,i+1);
}
if(b.equals(a)){
	System.out.println("palindrome");
}
else{
	System.out.println("not palindrome");
}
	}

}

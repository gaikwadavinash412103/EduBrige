package BasicJava;

import java.util.Scanner;

public class AramStrongNo {
	
	public static boolean check(int no) {
		int size=0;
		int val=no;
		int no2=0;
		while(val!=0) {
			int x=val%10;
			val=val/10;
			size++;
		}
		val=no;
		while(val!=0) {
			int x=val%10;
			val=val/10;
			no2+=(int)Math.pow(x,size);
		}
		if(no2==no) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		int no=sc.nextInt();
		System.out.println("Given No "+no+" is AramStrong :"+check(no));
	}
}

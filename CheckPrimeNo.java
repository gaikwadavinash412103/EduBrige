package Basic_java;
import java.util.*;
public class CheckPrimeNo {
	public static void primeNo(int a) {
		if(a>1) {
			if(a==2) {
				System.out.println("Given No Is A Prime NO");
			}else {
				boolean x=true;
				for(int i=2;i<a;i++) {
					if(a%i==0) {
						x=false;
						System.out.println("Given No Is Not A Prime NO");
						break;
					}
				}
				if(x==true) {
					System.out.println("Given No Is A Prime NO");
				}
				
			}
		}else {
			System.out.println("Given No Is Not A Prime NO");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Given No Is Prime No Or Not");
		System.out.print("Enter the any + ve no :");
		int a=sc.nextInt();
		CheckPrimeNo.primeNo(a);
	}

}

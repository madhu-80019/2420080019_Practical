package myproject1;
import java.util.*;
public class SumOfSquares {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int a=sc.nextInt();
		int b=0;
		for (int i=1;i<=a;i++) {
			b+=i*i;
		}
		System.out.println("sum of squares of numbers is "+b);
				
	}

}

//string is immutable     string builder is mutable

package myproject2;
import java.util.*;
public class StringBuilderExample {
	public static void main(String args []) {
		StringBuilder sb2=new StringBuilder();
		StringBuilder sb1=new StringBuilder("this is klh");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		
		sb.append(" hello ");
		System.out.println(sb);
		System.out.println(sb.insert(3,  "hello"));
		
		System.out.println(sb1.reverse());
		System.out.println(sb.replace(1, 5, "java")); //starting,ending index and replacement
		System.out.println(sb.delete(5, 10));
		System.out.println(sb.capacity()); //starts from 16, so empty string capacity=16
	
		
		//sb1.setCharAt(2,); //print will not work with it
		//System.out.println(sb1);
		System.out.println(sb1.substring(5));
		System.out.println(sb1.substring(5,8));
		
		System.out.println(sb1.deleteCharAt(5));
		String str1=sb.toString();
		System.out.println(str1);
		
		
		
		}

}

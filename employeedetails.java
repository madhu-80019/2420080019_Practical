package myproject1;
import java.util.*; //import this to use Scanner
public class employeedetails {
	public static void main(String args []) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter employee ID");
		long a=sc.nextLong();
		System.out.println("enter your slalary");
		double b=sc.nextDouble();
		System.out.println("Employee ID: "+a);
		System.out.println("Employe Salary:"+b);
		System.out.println("enter HRA value");
		float c=sc.nextFloat();
		System.out.println("enter DA value");
		float d=sc.nextFloat();
		System.out.println("enter PF value");
		float e=sc.nextFloat();
		System.out.println("HRA%="+(c/100)*b);
		System.out.println("DA%="+(d/100)*b);
		System.out.println("PF%="+(e/100)*b);
		
	}
	

}

//Create an employee pay roll system, read HRA, DA percent

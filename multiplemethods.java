package myproject2;

public class multiplemethods {
public void A() {
	System.out.println("this is in A");
}
public void b() {
	System.out.println("this is in b");
}public void C() {
	System.out.println("this is in C");
}public void D() {
	System.out.println("this is in D");
}
public static void main(String args []) {
	multiplemethods ob=new multiplemethods();
	ob.D();
	ob.C();
}

}

package myproject5;

public class constructorchaining {
 String name;
 int age;
 constructorchaining(String name, int age) {
  name="java";
  age=40;
  System.out.println(name +" "+ age);
 }
 constructorchaining(String name) {
  this(name,20);
  System.out.println(name +" "+age);
 }
 constructorchaining() {
  this("unknown");
  System.out.println("Default constructor called");
 }
 public static void main(String arge[]) {
  constructorchaining cc=new constructorchaining();
  constructorchaining cc1=new constructorchaining("ravi",50);
  constructorchaining cc2=new constructorchaining("raju");
 }
}
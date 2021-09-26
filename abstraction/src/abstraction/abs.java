package abstraction;

public class abs {
	public static void main(String[] args) {
		//maheshPhone obj= new maheshPhone();  //can not instantiate
		//obj.call();
		//so mahesh can call  all the method
		//maheshPhone obj = new sureshPhone();
		//rameshPhone h= new sureshPhone();
		maheshPhone obj= new amirPhone();
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
		obj.drive();
	}
}
 abstract class  maheshPhone   //when there is abstract method,the class must be abstract.And we can not instantiate
{
	public void call() {
		
		System.out.println("calling....");
	}
	public abstract void move();   //no implementation so we don't need it
	public abstract void dance();
	public  abstract void  cook();
	public abstract  void  drive();
	
}
 
 
 abstract class  rameshPhone extends maheshPhone{  //when you call abstract class from other class,you need to make this class abstract
	
	 
	 public void move()
	 {
		 System.out.println("movimg...");
	 }
	 
 }
 
 abstract class sureshPhone extends rameshPhone   
 {
	 public void  dance()
	 {
		System.out.println("dancing.."); 
	 }
	 public void  cook()
	 {
		 System.out.println("cooking..");  
	 }
	 public void move()
	 {
		 System.out.println("movimg.........");
	 }
 }
 class amirPhone extends sureshPhone   //concrete class 
 {
	 public void  drive()
	 {
		System.out.println("driving.."); 
	 }
	
 }

// abstract class can contain abstract as well as non-abstract methods
public abstract class A{
	// abstract methods can only be declared in an abstract class
	abstract void show();

	public void display(){
		System.out.println("Inside abstract class A");
	}
}

public class B extends A{
	// while extending an abstract class its compulsory 
	// to define the abstract method declared in abstract class
	public void show(){
		System.out.println("Inside class B extending abstract class A");
	}
}

public class AbstractClass{
	public static void main(String args[]){
		// Object of abstract class cannot be created
		B obj = new B();
		obj.show();
		obj.display();
	}
}
// Outer class cannot be declared static
public class A{
	public void show(){
		System.out.println("Inside show");
	}

	// Inner class can be declared static
	public static class B{
		public void config(){
			System.out.println("Inside config");
		}
	}
}

public class InnerClass{
	public static void main(String args[]){
		A obj = new A();
		obj.show();

		// with non-static class B we can create an object of B using A'a object
		// A.B obj1 = obj.new B();

		// with static class B we can create an object of B using class name A
		A.B obj1 = new A.B();
		obj1.config();
	}
}
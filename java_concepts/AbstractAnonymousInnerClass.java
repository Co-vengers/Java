public abstract class A{
	abstract void show();
	abstract void display();
}

public class AbstractAnonymousInnerClass{
	public static void main(String args[]){
		// this object doesn't belongs to class A
		// It belongs to the anonymous inner class 
		A obj = new A(){
			public void show(){
				System.out.println("Inside anonymous class");
			}
			public void display(){
				System.out.println("Another method in anonymoous class");
			}
		};

		obj.show();
		obj.display();
	}
}
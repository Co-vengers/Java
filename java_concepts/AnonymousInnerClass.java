class Source{
	public void show(){
		System.out.println("In Source");
	}
}

public class AnonymousInnerClass{
	public static void main(String args[]){
		Source s = new Source(){
			public void show(){
				System.out.println("In new");
			}
		};
		s.show();
	}
}
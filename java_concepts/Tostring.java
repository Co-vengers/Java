class Tostring{
	String message;
	Tostring(String msg){
		message = msg;
	}

	public String toString(){
		return message;
	}

	public static void main(String[] args){
		Tostring t1 = new Tostring("Object");
		Tostring t2 = new Tostring("Object");
		System.out.println(t1);
		System.out.println(t2);
	}
} 
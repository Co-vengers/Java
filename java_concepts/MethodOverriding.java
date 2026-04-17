class Test1{
    public void show(){
        System.out.println("Inside class Test1");
    }
}

class Test2 extends Test1{
    public void show(){
        System.out.println("Inside class Test2");
    }
}

class Test3 extends Test1{
    public void show(){
        System.out.println("Inside class Test3");
    }
}


public class MethodOverriding{
    public static void main(String[] args){
       Test1 t3 = new Test3();
       Test1 t2 = new Test2();
       System.out.println(t3);
       System.out.println(t2);
       t3.show();
       t2.show();
    }
}
public class MethodOverloading {

    public void show(int a, int b){
        int res = a + b;
        System.out.println("Inside parameterized show of int type with two parameters");
        System.out.println(res);
    }

    public void show(int a, int b, int c){
        int res = a + b + c;
        System.out.println("Inside parameterized show of int type with three parameters");
        System.out.println(res);
    }
    public static void main(String[] args){
        MethodOverloading e = new MethodOverloading();
        int a = 10, b = 20, c = 30;
        e.show(a, b, c);

    }
}
class Calculator{
    protected int add(int a, int b){
        return a+b;
    }
}

public class Exp{
    static int a = 10;
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int a = 10, b = 20;
        System.out.println(obj.add(a,b));
    }
}
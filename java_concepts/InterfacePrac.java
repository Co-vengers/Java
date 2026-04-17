interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("B");
    }
}

class InterfacePrac {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }

}
public class ToStringMethod{
    String message;
    ToStringMethod(String message){
        this.message = message;
    }

    public String toString(){
        return message;
    }


    public static void main(String args[]){
        ToStringMethod t1 = new ToStringMethod("Object");
        System.out.println(t1);
    }
}
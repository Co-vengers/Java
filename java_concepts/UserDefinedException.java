class TestException extends Exception{
    String message;

    TestException(String str) {
        message = str;
    }

    @Override
    public String toString(){
        return("TestException: "+message);
    }
    
}

public class UserDefinedException {
    public static void main(String args[]){
        int a = 10, b = 1, c;
        try{
            if(b == 1){
                throw new TestException("/ByOne");
            }
            else{
                c = a/b;
                System.out.println(c);
            }
        }
        catch(TestException e){
            System.err.println(e);
        }
        System.err.println("Bye");
    }
}

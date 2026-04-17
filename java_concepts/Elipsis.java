public class Elipsis {
    int sum;
    // This method can accept zero or more arguments of this specific type
    void add(int ...a){
        for(int i = 0 ; i < a.length ; i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Elipsis e = new Elipsis();
        int arr[] = {10, 20, 30, 40};
        e.add(arr);
        System.out.println(e.sum);
    }
}
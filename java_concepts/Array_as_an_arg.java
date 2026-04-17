public class Array_as_an_arg {
    void add(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Array_as_an_arg obj1 = new Array_as_an_arg();
        int arr1[] = {10, 20, 30, 40, 50, 60};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        obj1.add(arr1);
        obj1.add(arr2);
    }
}
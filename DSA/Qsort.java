package DSA;

public class Qsort {
    void qsort(int a[], int lower, int upper){
        int temp = 0;
        if(lower < upper){
            temp = split(a, lower, upper);
            qsort(a, lower, temp - 1);
            qsort(a, temp + 1, upper);
        }
    }

    int split(int a[], int lower, int upper){
        int pivot = a[lower];
        int left = lower + 1, right = upper, temp = 0;

        while(left <= right){
            while(a[left] < pivot){
                left++;
            }
            while(a[right] > pivot){
                right--;
            }

            if(left < right){
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }
        temp = a[lower];
        a[lower] = a[right];
        a[right] = temp;

        return right;
    }
    public static void main(String[] args){
        int a[] = {44, 33, 11, 55, 77, 90, 40, 60, 99, 22, 88, 66};
        System.out.println("Before Soritng:");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + "\t");
        }

        Qsort q_obj = new Qsort();
        q_obj.qsort(a, 0, a.length - 1);

        System.out.println("\n" + "After Soritng:");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + "\t");
        }

    }
}

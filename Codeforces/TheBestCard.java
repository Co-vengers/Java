import java.util.Scanner;
class TheBestCard{
    boolean isPrime(int num){
        if(num < 2) return false;

        for(int i = 2 ; i <= (num)/i ; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        TheBestCard b1 = new TheBestCard();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            
            if(b1.isPrime(n+1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
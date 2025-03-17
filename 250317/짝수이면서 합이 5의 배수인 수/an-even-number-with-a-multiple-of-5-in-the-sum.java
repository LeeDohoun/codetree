import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        magic(n);
    }

    public static void magic(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;

        }
        if(n%2 ==0){
            if(sum%5 == 0) System.out.print("Yes");
            else System.out.print("No");
        }

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nprint(n);
        // Please write your code here.
    }
    public static void nprint(int n){
        if( n == 0) return;
        
         System.out.print(n+ " ");
         nprint(--n);
         System.out.print((n+1)+ " ");
    }
}
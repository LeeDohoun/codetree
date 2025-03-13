import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        frecursion(n);
        System.out.println();
        brecursion(n);
    }
    public static void frecursion(int n){
        if(n==0) return;
        frecursion(n-1);
        System.out.print(n+" ");
    }
    public static void brecursion(int n){
        
        if(n==0) return;
        System.out.print(n+" ");
        brecursion(--n);
        
    }
}
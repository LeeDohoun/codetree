import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        starprint(n);
    }
    public static void starprint(int n){
        if(n==0) return;
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        starprint(--n);
        for(int i=0;i<n+1;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
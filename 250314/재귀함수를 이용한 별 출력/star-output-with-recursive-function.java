import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printstar(n);
    }
    public static void printstar(int n){
        if(n==0)return;
        printstar(--n);
        for(int i=1;i<=n+1;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
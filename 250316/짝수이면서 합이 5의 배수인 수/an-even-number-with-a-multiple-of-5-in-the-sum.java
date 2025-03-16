import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        magic(n);
    }

    public static void magic(int n){
        if(n%2 ==0){
            if(n%5 == 0) System.out.print("YES");
            else System.out.print("No");
        }

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        magic(n);
    }

    public static void magic(int n){
        int ten=n/10;
        int one=n%10;
        if(n%2 ==0){
            if((ten+one)%5 == 0) System.out.print("Yes");
            else System.out.print("No");
        }

    }
}
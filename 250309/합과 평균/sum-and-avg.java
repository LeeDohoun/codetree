import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B= sc.nextInt();
        double C = (A+B)/2.0;
        //2로 나누는것과 2.0으로나누는건 천지차이

        System.out.printf("%d %.1f",(A+B),C);
    }
}
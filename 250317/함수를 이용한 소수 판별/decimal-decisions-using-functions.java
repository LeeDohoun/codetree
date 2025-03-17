import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        prime(a,b);
    }

    public static void prime(int A, int B){
        int psum=0;
        for(int i=A;i<=B;i++){
            int count=0;
            if(i<2) count=1; 
            for(int j=2;j<i;j++){
                if(i%j==0) count=1; 
            }
            if(count!=1) psum+=i; 
        }
        System.out.print(psum);
    }
}
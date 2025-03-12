import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        meth(n,m);
    }

    public static void meth(int n,int m){
        int num=0;
        for(int i=1;i<101;i++){
            if((n%i==0) && (m%i==0))
            {num=i;}
        }
        System.out.print(num);
    }
}
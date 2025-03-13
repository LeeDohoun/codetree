import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        min(n,m);
    }
    public static void min(int n,int m){
        int minnum =0;
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
            if(n*i==m*j){
                minnum=i*n;
                break;
            }
            if(minnum!=0) break;
            }
        }
        System.out.print(minnum);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        square(n);
    }

    public static void square(int n){
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(num>9){
                    num=1;
                }
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.print(counts(A,B));
    }

    public static int counts(int A,int B){
        int cs=0;
        for(int i=A;i<=B;i++){
            if(i/10 ==3 || i/10 == 6||i/10 == 9){ cs++;

            }
            else if(i%10 ==3 || i%10 == 6 || i%10 ==9){
                cs++;
            }
            else if(i%3 == 0) cs++;
        }
        return cs;
    }
}
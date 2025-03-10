import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[][] num2d = new int[4][4];
        int[] sums = new int[4];
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int sum =0;
            for(int j=0;j<4;j++){
                num2d[i][j]=sc.nextInt();
                sum+=num2d[i][j];

            }
            sums[i]=sum;
            System.out.println(sums[i]);
        }
    }
}
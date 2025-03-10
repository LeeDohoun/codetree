import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        double[][] arr2d=new double[2][4];
        double[] columavr=new double[4];
        double[] rowavr=new double[2];
        double avr=0.0;
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                arr2d[i][j]=sc.nextDouble();
                columavr[j]+=arr2d[i][j];
                rowavr[i]+=arr2d[i][j];
                avr+=arr2d[i][j];
            }
            rowavr[i]=rowavr[i]/4.0;
        }
        System.out.printf("%.1f %.1f\n",rowavr[0],rowavr[1]);
        for(int i=0;i<4;i++){
            columavr[i]=columavr[i]/2.0;
            System.out.printf("%.1f ",columavr[i]);
        }
        System.out.printf("\n%.1f",avr/8.0);
    }
}
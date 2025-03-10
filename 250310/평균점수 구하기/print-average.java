import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        double[] score=new double[8];
        double sum=0.0;
        for(int i=0;i<8;i++){
            score[i]=sc.nextDouble();
            sum+=score[i];
        }
        System.out.printf("%.1f",sum/8.0);
    }
}
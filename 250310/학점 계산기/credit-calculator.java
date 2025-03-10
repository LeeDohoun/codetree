import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        double scor[]=new double[n];
        double sum=0.0;
        for(int i=0;i<n;i++){
            scor[i] = sc.nextDouble();
            sum+=scor[i];
        }
        double average = sum/(double)n;
        System.out.printf("%.1f \n",average);
        if(average >= 4.0){
        System.out.print("Perfect");
        }
        else if(average>=3.0){
        System.out.print("Good");

        }
        else if(average<3.0){
        System.out.print("Poor");

        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[] num = new int[10];
        int sum =0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            num[i]=sc.nextInt();
            if(num[i]>=250){
                System.out.printf("%d %.1f",sum,(sum/(double)i));
                break;
            }
            sum+=num[i];
        }
        if(num[9]<250){
             System.out.printf("%d %.1f",sum,(sum/(double)i));
        }
    }
}
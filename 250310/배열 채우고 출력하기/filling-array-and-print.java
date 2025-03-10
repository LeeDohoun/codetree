import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc=new Scanner(System.in);
        int[] nums = new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            nums[i]=sc.nextInt();

        }
        for(int i=0;i<10;i++){
            sum+=nums[i];

        }
        System.out.print(sum);
    }
}
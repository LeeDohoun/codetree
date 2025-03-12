import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                arr[i]+=sc.nextInt();
            }
            arr[i]/=4;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=60){
                System.out.println("pass");
                count++;
            }
            else{
                System.out.println("fail");
            }
        }
        System.out.print(count);
    }
    
}
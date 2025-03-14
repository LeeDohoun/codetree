import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int sum=0;
        double aver=0.0;
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(i%2!=0) sum+=arr[i];
        }
        aver=sum/5.0;
        System.out.print(sum+" "+aver);
    }
}
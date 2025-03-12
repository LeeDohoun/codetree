import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
        int n;
        for(n=0;n<10;n++){
            arr[n]=sc.nextInt();
            if(arr[n]==0)
            break;
        }
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 ==0){
                sum+=arr[i];
                count++;
            }
        }
        System.out.print(count+" "+sum);
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num;
        for(num=0;num<10;num++){
            arr[num]=sc.nextInt();
        
        if(arr[num]==0)
        break;
        }
    int sum=0;
    for(int i=0;i<num;i++){
        sum+=arr[i];
    }
    System.out.printf("%d %.1f",sum,(double)sum/(num));
    sc.close();
    
    
    }
    
}
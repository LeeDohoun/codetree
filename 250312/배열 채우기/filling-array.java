import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[] arr=new int[10];
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0)
            {
                break;
            }
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
       sc.close();
    
    }
}
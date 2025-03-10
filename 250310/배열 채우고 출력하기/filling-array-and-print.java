import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc=new Scanner(System.in);
        char[] texts = new char[10];
       
        for(int i=0;i<10;i++){
            texts[i]=sc.next().charAt(0);

        }
        for(int i=0;i<10;i++){
             System.out.print(texts[9-i]);

        }
       
    }
}
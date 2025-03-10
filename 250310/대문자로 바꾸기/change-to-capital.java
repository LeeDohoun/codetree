import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[][] array2d=new String[5][3];
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                array2d[i][j]=sc.next();
                System.out.print(array2d[i][j].toUpperCase()+" ");
            }
            System.out.printf("\n");
        }
    }
}
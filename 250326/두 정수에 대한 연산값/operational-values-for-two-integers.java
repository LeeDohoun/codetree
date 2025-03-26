import java.util.Scanner;

class wraapInt{
    int value;
    public wraapInt(int n){
        value=n;
    }
}

public class Main {

    public static void magic(wraapInt a,wraapInt b){
        if(a.value<b.value){
            b.value+=25;
            a.value= a.value*2;

        }
        else{
            a.value+=25;
            b.value*=2;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        wraapInt wa=new wraapInt(a);
        wraapInt wb= new wraapInt(b);

        magic(wa,wb);
        System.out.printf("%d %d",wa.value,wb.value);

    }
}
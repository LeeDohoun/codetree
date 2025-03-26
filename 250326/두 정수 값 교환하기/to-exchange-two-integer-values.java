import java.util.Scanner;

class WrappInt{
    int value;
    public WrappInt(int n){
        value=n;
    }

}

public class Main {


    public static void swap(WrappInt n, WrappInt m){
        int temp=n.value;
        n.value=m.value;
        m.value=temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        WrappInt wn= new WrappInt(n);
        WrappInt wm = new WrappInt(m);

        swap(wn,wm);
        System.out.printf("%d %d",wn.value,wm.value);
    }
}
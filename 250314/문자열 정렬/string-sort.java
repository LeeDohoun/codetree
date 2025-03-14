import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] cs=s.toCharArray();
        Arrays.sort(cs);
        String ns = new String(cs);
        System.out.print(ns);
    }
}
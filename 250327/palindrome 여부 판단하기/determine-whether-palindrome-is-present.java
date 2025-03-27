import java.util.Scanner;
public class Main {
    public static boolean palan(String input){
        int n=input.length();
        boolean check =true;
        for(int i=0;i<n;i++){
           if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
    check = false;
}
        }
        return check;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        if(palan(input)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
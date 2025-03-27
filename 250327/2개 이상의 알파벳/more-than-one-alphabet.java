import java.util.Scanner;
public class Main {

    public static boolean check(String A){
        int fullcount=0;
        for(int i=0;i<A.length();i++){
            int count =1;
            for(int j=0;j<A.length();j++){
                
                if(j!=i){
                    if(A.charAt(i) == A.charAt(j)) count=0;
                }
            }
            fullcount+=count;
        }

        if(fullcount>=2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if(check(A)) {
            System.out.print("Yes");

        }
        else{
            System.out.print("No");
        }
    }
}
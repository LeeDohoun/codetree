import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(counts(A, B));
    }

    public static int counts(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (contains369(i) || i % 3 == 0) count++;
        }
        return count;
    }

    // 재귀함수: 숫자에 3, 6, 9가 포함되어 있는지 확인
    /* 이런형식 말고 while(n!=0)안에서 % 통해서 해당 부분이 3,6,9인지 체크 하고 만약 그러면 true
    아니면 n/=10; 아 while()문 빠져나오면 없는거니 false 반환.
    
    */
    public static boolean contains369(int n) {
        if (n == 0) return false;
        if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) return true;
        return contains369(n / 10);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        weather(y,m,d);
    }
    public static void weather(int y,int m,int d){
          if(check(y,m,d)) {
                    System.out.print(-1);
                    return;
                }

        if(3<=m&&m<=5){
                System.out.print("Spring");
           
        }
        else if(6<=m&&m<=8){
            System.out.print("Summer");
        }
        else if(9<=m&&m<=11){
            System.out.print("Fall");
        }
        else if(12==m||m<=2)
        {
            if(m==2)
            {
                if(check2(y))
                {//윤년
                if(d<=29)
                {
                    System.out.print("Winter");
                }
                else{
                    System.out.print(-1);
                }
                }
                else{
                    if(d<=28){
                        System.out.print("Winter");
                    }
                    else{
                    System.out.print(-1);
                }

                }
            }
            else{
                System.out.print("Winter");
            }

        }
        

    }
    public static boolean check(int y,int m,int d){
        if(1<=y&&y<=3000){
            if(1<=m&&m<=12){
                if(1<=d&&d<=31)
                return false;
            }
        }
        return true;
    }


    public static boolean check2(int y){
        if(y%4==0 && y%100==0 && y%400==0){
            return true;
        }
        else if(y%4==0 && y%100 ==0){
            return false;
        }
        else if(y%4 ==0)
        {return true;
        }
        else{
            return false;
        }
        //return false;
    }
}
import java.util.Scanner;
public class 斐波那契数列{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        while(n>f2){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }//该循环结束时，f1<n<=f2
        //找出变为Fibonacci数的最小步数
        int ret = 0;
        if ((f2 - n ) > ( n - f1))
        {
            ret = (n-f1);
        }
        else{
            ret = (f2-n);
        }
        System.out.println(ret);
    }
}


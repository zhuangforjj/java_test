import java.util.Scanner;

/**
 * @author jj
 * @date 2019/7/29-10:16 PM
 */
public class StackTraceTest {
    public static int factorial(int n){
        System.out.print("factorial("+n+"):");
        Throwable t=new Throwable();
        StackTraceElement[] frame=t.getStackTrace();
        for(StackTraceElement f:frame){
            System.out.println(f);
        }
        int r;
        if(n<=1) r=1;
        else r=n*factorial(n-1);
        System.out.println("return "+r);
        return r;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter:n ");
        int n=in.nextInt();
        factorial(n);
    }
}

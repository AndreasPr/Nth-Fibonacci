/**
 * Created on 06/Jan/2021 to Nth-Fibonacci
 */
public class nthFibonacci {

    public static int fib(int n){
        int f[] = new int[n + 1];
        int i;

        f[0] = 0;

        if(n > 0){
            f[1] = 1;

            for(i = 2; i <= n; i++){
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f[n];
    }

    public static void main(String args[]){
        int n = 9;
        System.out.println(fib(9));
    }

}

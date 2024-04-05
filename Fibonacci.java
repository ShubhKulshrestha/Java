//Fibonacci series..
 public class fibonacci{
    public static void main(String[] args) {
        int i, n = 10, a = 0,b = 1;
        System.out.print(a +" " +b+" ");
        for (i = 1; i<=n; i++){
            int fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib+" ");
        }
    }
}

package anabneri;

public class nthFibonacci {
    public static int getNthFib(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 1) {
            return 0;
        } else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }
}


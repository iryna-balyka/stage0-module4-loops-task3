package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib;
        int first = 0;
        System.out.println(first);
        int second = 1;
        System.out.println(second);
        for (int i = 2; i < lastFibonacci; i++) {
            fib = first + second;
            first = second;
            second = fib;
            System.out.println(fib);

        }
    }
}

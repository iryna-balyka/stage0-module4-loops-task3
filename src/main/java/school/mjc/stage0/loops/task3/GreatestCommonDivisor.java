package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int div = 1;
        int i = 2;
        if ((first == 0)||(second == 0)){
           div = Math.abs(first - second);
        } else {
            if (first <= second) {
                while (i <= first) {
                    if ((first % i == 0) && (second % i == 0)) {
                        div = div * i;
                        first = first / i;
                        second = second / i;// div 6, i 3, f=s=5
                    } else i++;
                }
            } else {
                while (i < second + 1) {
                    if ((first % i == 0) && (second % i == 0)) {
                        div = div * i;
                        first = first / i;
                        second = second / i;
                    } else i++;
                }
            }
        }
        System.out.println(div);
    }
}

package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int num = 0;
        int sum = 0;
        int x = 1;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            num = num + 9 * x;
            x = x * 10;
            sum = sum + num;
        }
        System.out.println(sum);
    }
}

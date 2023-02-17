package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = Math.abs(t);
        String s = "" + t;
        int p = 0;
        for (int i = 0; i < s.length(); i++){
            p = p + t % 10;
            t = t / 10;
        }
        System.out.println(p);
    }
}

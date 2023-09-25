import java.util.HashSet;

public class HappyNumber{
    public boolean isHappy(int n) {
        HashSet<Double> used = new HashSet<>();
        double sum = 0;
        while (true) {
            while (n != 0) {
                sum = sum + Math.pow((n % 10), 2);
                n = n / 10;
            }
            System.out.println(sum);
            if (sum == 1) {
                return true;
            } else {
                if (used.contains(sum)) {
                    return false;
                } else {
                    used.add(sum);
                    n = (int) sum;
                    sum=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(85));
    }
}
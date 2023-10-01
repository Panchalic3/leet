public class ClimbingStairs {
    public int climbStairs(int n) {
        int root = 1;
        int root2 = 1;
        int sum = 0;
        int count = 0;
        if(n == 1 || n == 2) {
            count= n;
        }
        else {
            for (int i = 0; i < n-1; i++) {
                sum = root + root2;
                root = root2;
                root2 = sum;
                count = sum;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ClimbingStairs o = new ClimbingStairs();
        System.out.println(o.climbStairs(4));
    }

}

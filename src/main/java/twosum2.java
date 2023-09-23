import java.util.HashMap;


public class twosum2 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        // Storing value
        for (int i = 0; i<len ; i ++){
            map.put(nums[i],i);
        }
        int [] output = new int[2];
        for (int i = 0; i<len ; i ++){
            int num = nums[i];
            int rem = target-num;
            if (map.containsKey(rem) && i!=map.get(rem)){
                output[0]= i;
                output[1]= map.get(rem);
            }

        }
        return output;
    }

    public static void main(String[] args) {
        twosum2 obj = new twosum2();
        int[] num = new int[4];
        num= new int[]{3,2,4};
        obj.twoSum(num,6);
        System.out.println( obj.twoSum(num,6));

    }
    }

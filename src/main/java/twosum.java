//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
public class twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int len = nums.length;
        for (int i = 0; i < len-1; i ++){
            for (int j =i+1; j <len; j++ ){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                    break;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        twosum obj = new twosum();
        int[] num = new int[4];
        num= new int[]{2, 7, 11, 15};
    //   int [] num[4] = new int[]{2, 7, 11, 15};
        System.out.println(obj.twoSum(num,13));

    }

}

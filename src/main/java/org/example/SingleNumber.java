package org.example;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int l = nums.length;
        int output = 0;
        for (int i = 0; i < l ; i ++){
            output=output^nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,2,1};
        SingleNumber o = new SingleNumber();
        System.out.print(o.singleNumber(arr));
    }
}

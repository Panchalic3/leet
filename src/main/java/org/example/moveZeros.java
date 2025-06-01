package org.example;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int currenrtPosition = 0;
        for (int i = 0; i < len; i++) {  // 0, 9, 0 , 7, 88, 93
            if (nums[i] != 0) {
                nums[currenrtPosition] = nums[i];
                currenrtPosition++;
            }
        }

        for (int j = currenrtPosition; j < len; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeros o = new moveZeros();
        int[] nums = {6, 0, 0, 9, 7, 0, 0, 5, 3, 88, 23};
        o.moveZeroes(nums);
            for(int c:nums){
            System.out.print(c +" ");
        }
    }
}
package org.example;
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum =0;
        int actualSum;
        int len = nums.length;
        for (int number:nums){
            sum=sum+number;
        }
        actualSum=(len*(len+1))/2;
        return actualSum-sum;
    }

    public static void main(String[] args) {
        int []a= new int[]{0,1, 3, 4, 5};
        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(a));

    }
}


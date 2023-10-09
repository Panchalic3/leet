package org.example;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int insertPos  = 0 ;
        for(int i = 0 ; i <length; i ++){
          if(nums[i]!=0){
              nums[insertPos]=nums[i];
              insertPos++;
          }
        }

        for (int j = insertPos; j>=length; j ++ ){
            nums[j]=0;
        }


    }

    public static void main(String[] args) {
        int nums[]=new int[2];
        nums[0]=0;
        nums[1]=1;
      //  nums[2]=1;
//        nums[3]=0;
//        nums[4]=36;
        moveZeros moveZeros= new moveZeros();
        moveZeros.moveZeroes(nums);
        int length = nums.length;
        for (int i = 0; i < length ; i++){
            System.out.println(nums[i]);
        }
    }
}

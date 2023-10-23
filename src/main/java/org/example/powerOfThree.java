package org.example;
//Given an integer n, return true if it is a power of three. Otherwise, return false.
//
//        An integer n is a power of three, if there exists an integer x such that n == 3x.
public class powerOfThree {
    public boolean isPowerOfThree(int n) {
        boolean result = false;
        if(n==1||n==3){
            result=true;
            return result;

        }else {
            while (n > 3) {
                int rem = n % 3; //9%3=0
                int div = n / 3; //9/3=3
                if (rem == 0) {
                    n = div;
                } else {
                    return result;
                }
                if (div == 3) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        powerOfThree o = new powerOfThree();
        System.out.println(o.isPowerOfThree(1));
    }
}





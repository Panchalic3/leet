package org.example;

public class sqrt {
    public long mySqrt(int x) {
        long  low = 1;
        long high = x;
        int ans = 0;
        while(low <=high) {
            if (low-high==1) {
                ans=(int)high;
                break;
            }
            else if(x==1){
                ans=1;
                break;
            }
            else {
                long mid = (low + high) / 2;
                long val = mid * mid;
                if (val <= x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                    ans=(int)high;
                }
            }
        }
            return ans;
    }
        public static void main(String[] args) {
        sqrt o = new sqrt();
        System.out.println(o.mySqrt(1));
    }





    }


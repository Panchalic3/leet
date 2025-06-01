package org.example;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for (int j = l - 1; j >= 0; j--) {
            if (digits[j] != 9) {
                digits[j]++;
                return digits;
            } else {
                digits[j] = 0;
            }
        }
        int[] ar2 = new int[l + 1];
        ar2[0] = 1;
        return ar2;
    }

    public static void main(String[] args) {
        PlusOne o = new PlusOne();
        int[] a = new int[3];
        a[0] = 9;
        a[1] = 0;
        a[2] = 9;

        int v[] = o.plusOne(a);
        for (int i = 0; i <=v.length - 1; i++) {
            System.out.print(v[i]);
        }

    }
}



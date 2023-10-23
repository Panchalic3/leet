//package org.example;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class ReverseBits {
//    public int reverseBits(int n) {
//        char charar[] = String.valueOf(n).toCharArray();
//        char temp = 0;
//        int l = 15 ;// 0-15   16 - 31 //  31, 31-31,// 30,31-30 // 29,31-29  ..... //16,31-16=
//        for(int i = 31 ; i>=16 ;i-- ){
//            temp = charar[i]; //31         // got the bits
//            charar[i]=charar[31-i]; //31=0
//            charar[31-i]=temp;
//        }
//    }
//
//    }

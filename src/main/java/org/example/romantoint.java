package org.example;

import java.util.HashMap;
public class romantoint {
    public int romanToInt(String s) {
        HashMap<Character, Integer> store = new HashMap();
        store.put('I',1);
        store.put('V',5);
        store.put('X',10);
        store.put('L',50);
        store.put('C',100);
        store.put('D',500);
        store.put('M',1000);
        int length = s.length();
        int number = store.get(s.charAt(length-1));
        for (int i=length-2; i>=0; i--){
            if(store.get(s.charAt(i))>=store.get(s.charAt(i+1))){
                number=number + store.get(s.charAt(i));
            }
            else{
                number=number - store.get(s.charAt(i));
            }
        }
        return number;
    }

    public static void main(String[] args) {
        romantoint obj = new romantoint();
        System.out.println(obj.romanToInt("DCXXI"));
    }
}

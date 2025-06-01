package org.example;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        int flag = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String check = haystack.substring(i, needle.length() + i);
                if (check.equals(needle) && haystack.length() > needle.length()) {
                    flag = i;
                    break;
                }
            } else {
                flag = -1;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        FindtheIndexoftheFirstOccurrenceinaString f = new FindtheIndexoftheFirstOccurrenceinaString();
        System.out.println(f.strStr("aaa", "aaaa"));
    }


}
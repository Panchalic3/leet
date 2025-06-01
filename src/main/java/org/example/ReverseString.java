package org.example;

public class ReverseString {
    public char[] reverseString(char[] s) {
        int len = s.length;
        if(len%2==0){
            for(int i=0;i<=((len/2)-1); i++){
                int back = len-i;
                char temp =s[i];
                s[i]=s[back-1];
                s[back-1]=temp;
            }
        }
        else{
            for(int i=0;i<=(len/2); i++){
                int back =  len-i;
                char temp = s[i];
                s[i]=s[back-1];
                s[back-1]=temp;
            }


            }
        return  s;
    }

    public static void main(String[] args) {
        ReverseString o = new ReverseString();
       char[] s = {'h','e','l','l','o'};
        System.out.println(o.reverseString(s));
    }
}

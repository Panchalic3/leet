package org.example;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String str) {
        boolean flag =true;
        Stack<Character> s = new Stack();
        if (str.length()<=1 || str.length()%2==1 || containsOnlyOpen(str) || str.charAt(0)==')'
                || str.charAt(0)=='}' || str.charAt(0)==']'
                || str.charAt(str.length()-1)=='('
                || str.charAt(str.length()-1)=='{' || str.charAt(str.length()-1)=='['

        ) {flag = false;}
        else{
            for (char ch : str.toCharArray()){
                if(isOpenbracket(ch)){
                    s.push(ch);
                    flag=false;
                }
                else if (s.isEmpty()){flag=false;break;}
                else if ( isMatching(s.peek(),ch)){
                    if(!s.isEmpty()){flag=true;
                        s.pop();}
                    if(s.isEmpty()){flag=true;}
                    else{flag=false;}

                }
                else{flag=false;break;}

            }
        }
        return flag;
    }




    public boolean containsOnlyOpen(String str){
        boolean flag = true;
        for(int i =0 ; i<str.length(); i ++){
            if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']'){
                flag= false;
                break;
            }
        }
        return flag;
    }
    public boolean isOpenbracket(char ch){
        boolean v = false;
        if (ch ==  '('|| ch ==  '{'|| ch == '[') {v = true;}
        return v;
    }
    public boolean isMatching(char a, char b){
        return (
                (a=='(' && b==')') ||
                        (a=='{' && b=='}') ||
                        (a=='[' && b==']')
        );

    }

    public static void main(String[] args) {
        ValidParentheses o = new ValidParentheses();
        System.out.println(o.isValid("()))"));
    }
}







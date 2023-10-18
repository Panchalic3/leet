package org.example;
public class excellSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int result = 0;
        for(int i = 0; i < len ; i ++){
            result=result*26;
            int test = columnTitle.charAt(i)-'A'+1;
            result=result+(columnTitle.charAt(i)-'A'+1);
            System.out.println("inside loop  " +test);
        }
        //System.out.println(result);
        return result;



    }

    public static void main(String[] args) {
        excellSheetColumnNumber o = new excellSheetColumnNumber();
        System.out.println(o.titleToNumber("AB"));
    }
}

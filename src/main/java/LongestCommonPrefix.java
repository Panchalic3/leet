import java.util.Arrays;

public class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[len-1];
        int index = 0;
            while (index<s1.length()){
                if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
                else{break;}
            }
            return index==0?"":s1.substring(0,index);
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
    //
    }
}
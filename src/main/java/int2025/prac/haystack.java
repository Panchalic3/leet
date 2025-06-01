package int2025.prac;

public class haystack {
    public static void main(String[] args) {
        int j = haystack.strStr("hanibaninibbabanibanihabi","bani");
        System.out.println(j);
    }
    
    public static int strStr(String haystack, String needle) {// sadbutsa, sad, 8, 3
        int n = needle.length(); //8
        int h = haystack.length(); //3
        int r = -1;

        if(n>h){
            return r;
        }
        if(haystack.equals(needle)){
            return 0;
        }

        h=h-n;
        for(int i = 0; i <h+1; i ++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i+n).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}

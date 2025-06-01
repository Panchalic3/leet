package int2025.prac.model;

import int2025.prac.int1;

public class int5 {

        public static String reverseWords(String s) {
            String trimmed = s.trim().replaceAll("\\s", " ");
            String [] words = trimmed.split(" +");
            StringBuilder sb = new StringBuilder();

            for(int i = words.length-1; i>=0; i--){
                sb = sb.append(words[i]);
                if (i != 0) {
                    sb.append(" ");
                }        }
            return sb.toString().trim();

    }

    public static void main(String[] args) {
            String a = "a good   example";
        System.out.println(reverseWords(a));

    }


}

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstUniqueCharacterOfAString {
    public int firstUniqChar(@NotNull String s) {
        int freq[] = new int[26];
        int len = s.length();
        for (int i = 0; i <len ; i ++){
            freq[s.charAt(i)-'a']++;
        }
        for (int i = 0; i <len ; i ++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterOfAString o = new FirstUniqueCharacterOfAString();
        String aho = null;
        System.out.println(o.firstUniqChar("haha"));
       //o.firstUniqChar("PANCHALI");
    }
    }

package int2025.prac;

import java.util.*;

public class int2 {

    public static void main(String[] args) {
        String ram = "aa";
        String mag = "ab";
        int2 z = new int2();
        z.canConstruct(ram, mag);

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> store = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            if(store.containsKey(ch)){
                store.put(ch, store.get(ch)+1);
            }
            else{
                store.put(ch,1);
            }
        }

        for(char ch : ransomNote.toCharArray()){
            if(store.containsKey(ch)){
                store.put(ch, store.get(ch)-1);
                if(store.get(ch)-1 == 0){
                    store.remove(ch);
                }
            }
            else{
                System.out.println("false");
                return false;
            }
        }
        System.out.println("tuuuuuuu");

        return true;

    }
}

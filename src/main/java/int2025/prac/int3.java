package int2025.prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class int3 {

    public static void main(String[] args) {
        String ram = "badc dada fafa jaja nana kaka ll";
        String mag = "baba";
        int3 z = new int3();
        z.isIsomorphic(ram, mag);
        String[] arr = ram.split(" ");
        System.out.println(arr[0]);

    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            Map<Character, Character> store = new HashMap<>();
            List<String> js = new ArrayList<>();
            for(int i = 0; i<s.length(); i++){
                if(store.containsKey(s.charAt(i)) && store.get(s.charAt(i))!= t.charAt(i)){
                    System.out.println("falsese");
                    return false;
                }
                else{
                    store.put(s.charAt(i), t.charAt(i));
                }

            }
        }
        System.out.println("trurrrrr");
        return true;
    }
}

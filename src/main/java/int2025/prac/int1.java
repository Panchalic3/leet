package int2025.prac;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;

public class int1 {
    public static void main(String[] args) {
        int [] test = {1,3,44,6,23,17,21,3,44,1,2,2,1,44,23};
        int1 z = new int1();
        z.toMap(test);

    }


    void toMap(int [] arr)  {
       // Map<Integer, Integer> store = new HashMap<>() ;
        Arrays.sort(arr);
        List<Integer> a =Arrays.stream(arr).boxed().collect(Collectors.toList());

        int random =5+ (int)(Math.random() *16);
        String str = "PPP";
        String str2 = str.toLowerCase(Locale.ROOT);
        String s1 = str.toLowerCase();

        System.out.println(str2);
        System.out.println(s1);


    }
}

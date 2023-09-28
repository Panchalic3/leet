import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fizzbuzz {
    public List<String> fizzBuzz(int n) {
       List<String> ans = new ArrayList<>();
       for (int i = 0; i<n;i++){
           int number =i+1;
           if(number%3==0 && number%5!=0){
               ans.add("Fizz");
           }
           else if(number%3!=0 && number%5==0){
               ans.add("Buzz");
           } else if (number%3==0 && number%5==0) {
               ans.add("FizzBuzz");
           }
           else{
               ans.add(String.valueOf(number));
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        Fizzbuzz f = new Fizzbuzz();
        System.out.println(f.fizzBuzz(15));
    }
}

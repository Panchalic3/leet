package int2025.prac;

import int2025.prac.model.Transaction;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Longest string in stream
 */
public class streamPrac1 {
    public void lo() {
        List<String> strings = List.of("Apple", "Banana", "Pie", "Mobile", "Work",
                "BlueBerry", "Oranges", "Grape", "Sitaphal");

        Optional<String> l =
                strings.stream().max(Comparator.comparingInt(s -> s.length()));
    }

    /**
     * Finds average of a stream
     */
        public void averageAge () {
            Map<String, Integer> personMap = new HashMap<>();
            personMap.put("Alice", 25);
            personMap.put("Bob", 30);
            personMap.put("Charlie", 35);


            double ave = personMap.values().stream()
                    .mapToInt(age -> age).average()
                    .orElse(0);
        }


    /**
     * check if list contains prime using stream
     */

    public void findPrime(){
        int[] arr = {1,3,20, 83, 55, 23, 73, 6, 8,34};
        List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
        boolean res = nums.stream().anyMatch(num -> isPrime(num));
    }

    /**
     * Merge two sorted list and return a sorted list
     */
    public void mergeSortedList(){
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> sortedList = Stream.concat(list1.stream(), list2.stream()).sorted()
                .collect(Collectors.toList());

    }
    /**
     * Intersection/Common elements
     */
    public void intersection(){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> common = list1.stream().filter(n ->list2.contains(n)).collect(Collectors.toList());
    }

    /**
     *  Union
     */
    public void union(){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> comm = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
    }

    /**
     * Remove duplicate
     */
    public void removeDuplicate(){
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> unique = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
    }

    /**
     * Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
     */
    public void transaction(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
//        Map<String, Integer> S = transactions.stream().collect(Collectors.groupingBy(transaction -> transaction.getDate()),
//                Collectors.summingInt(t-> t.getClass()));
    }

    /**
     * find kth smallest elemet
     */
    public void kthSmallest(){
        int[] arr = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element

        int kth = Arrays.stream(arr).boxed().sorted().skip(k-1).findFirst().orElse(-1);

        int big = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .findFirst().orElse(-1);

        int kthLargest = Arrays.stream(arr)
                .boxed()                            // Convert to Stream<Integer> for custom sort
                .sorted(Comparator.reverseOrder())  // Sort in descending order
                .skip(k - 1)                        // Skip first (k-1) elements
                .findFirst()                        // Get the k-th largest
                .orElse(-1);
    }

    /**
     * Given a list of strings, find the frequency of each word using Java streams:
     */
    public void findFreq(){
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");

        Map<String, Long> res = words.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
                )
        );
    }































































































    /**
     *
     * @param number
     * @return
     */
    public boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



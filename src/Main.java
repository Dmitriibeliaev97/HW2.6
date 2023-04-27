import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3();
        System.out.println("Задание 4");
        task4();
    }

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> words = new HashSet<>(strings);
        System.out.println(words);
    }

    public static void task4() {
        Map<String, Long> duplicates = strings.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
        duplicates.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
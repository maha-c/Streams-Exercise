import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            System.out.println(numbers);
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * 2)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
            System.out.println("Even numbers doubled and sorted in descending order:");
            evenNumbers.forEach(System.out::println);
            int sum = evenNumbers.stream().reduce(0, Integer::sum);
            System.out.println("Sum of even numbers: " + sum);
        }
    }
}

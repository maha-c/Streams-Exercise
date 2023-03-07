import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThursdayStreamsExercise {
    public static void main(String[] args) {

        List<String> favFood = new ArrayList<>();
        favFood.add("Pizza");
        favFood.add("Pasta");
        favFood.add("ApplePie");
        favFood.add("IceCream");
        favFood.add("Biryani");
        favFood.add("Burger");
        favFood.add("Fries");
        favFood.add("Salad");
        System.out.println("List of my fav foods:" + favFood);

       // Sort food alphabetically
        List<String> sortedList = favFood.stream().sorted().toList();
        System.out.println("Sorted List of Food items:" + sortedList);

        //Filter food that starts with letter "P"
        List<String> filteredList = favFood.stream().filter(food -> food.startsWith("P")).toList();
        System.out.println("Food starts with letter 'p':" + filteredList);

        //Map food items to its length
        List<Integer> mappedList = favFood.stream().map(String::length).toList();
        System.out.println(mappedList);

        //Print each food items with lowercase letters
        favFood.stream().map(String::toLowerCase).forEach(System.out::println);

        //Reduce all food items into one String
        String wholeList = favFood.stream().reduce("",(f , food) -> f + food);
        System.out.println("Whole List of Food items concatenated to: " + wholeList);

        //Filter, map and collect and concatenate food items
        List<String> result = favFood.stream()
                .filter(s -> !s.toLowerCase().contains("b"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Resulting String would be: " + result);


    }
}

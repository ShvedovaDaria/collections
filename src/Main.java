import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        Collections.sort(numbers);
        System.out.println("Список за зростанням: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Список за спаданням: " + numbers);

        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple", "grape"));
        Set<String> uniqueStrings = new LinkedHashSet<>(strings);
        List<String> uniqueList = new ArrayList<>(uniqueStrings);
        System.out.println("Список без дублікатів: " + uniqueList);

        List<Integer> numberList = new ArrayList<>(Arrays.asList(10, 5, 8, 3, 12));
        int minValue = Collections.min(numberList);
        int maxValue = Collections.max(numberList);
        System.out.println("Найменше число: " + minValue);
        System.out.println("Найбільше число: " + maxValue);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        Set<Integer> mergedSet = new HashSet<>(list1);
        mergedSet.addAll(list2);
        List<Integer> mergedList = new ArrayList<>(mergedSet);
        System.out.println("Об'єднаний список без дублікатів: " + mergedList);

        List<Integer> checkList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int elementToCheck = 30;
        if (checkList.contains(elementToCheck)) {
            System.out.println("Елемент " + elementToCheck + " присутній у списку.");
        } else {
            System.out.println("Елемент " + elementToCheck + " відсутній у списку.");
        }
    }
}

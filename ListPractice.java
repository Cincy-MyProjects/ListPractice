import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values (-1 to stop):");
        while (true) {
            System.out.print(": ");
            int input = in.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        in.close();

        System.out.println("Your values, reversed:");
        list = reverseList(list);
        for (int value : list) {
            System.out.println(value);
        }
        System.out.println("String to Array: " + Arrays.toString(stringToArray("Ham")));
        System.out.println("List with Bounds1: " + Arrays.toString(generateArrayWithBounds(5, 10, 1)));
        System.out.println("List with Bounds2: " + Arrays.toString(generateArrayWithBounds(11, 18, 3)));
        System.out.println("List with Bounds3: " + Arrays.toString(generateArrayWithBounds(1, 2, 1000)));

        List<String> stringList = new ArrayList<>();
        stringList.add("Amoeba");
        stringList.add("amoeba great");
        stringList.add("great");
        stringList.add("test amoeba");
        findAndDestroyAllAmoebas(stringList);
        System.out.println("Filtered List: " + stringList);
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static char[] stringToArray(String str) {
        return str.toCharArray();
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < end; i += step) {
            list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void findAndDestroyAllAmoebas(List<String> list) {
        list.removeIf(s -> s.toLowerCase().contains("amoeba"));
    }
}

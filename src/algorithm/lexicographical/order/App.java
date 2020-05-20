package algorithm.lexicographical.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Peach", "Apple", "Mango", "Cherry", "Orange");
        List<String> ordered = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (ordered.size() == 0) {
                    ordered.add(list.get(i));
                    break;
                }

                if (ordered.get(j).compareTo(list.get(i)) > 0) {
                    ordered.add(j, list.get(i));
                    break;
                }
            }
        }

        ordered.stream().forEach(a-> System.out.println(a));
    }
}

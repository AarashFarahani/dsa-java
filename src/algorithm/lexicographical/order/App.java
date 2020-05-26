package algorithm.lexicographical.order;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Peach", "Apple", "Mango", "Cherry", "Orange");
        sort(list).stream().forEach(a-> System.out.println(a));

        System.out.println("*************************************************************************");

        list = Arrays.asList("a3ff", "z8dg", "b2er", "a9br", "ad2s");
        sort(list).stream().forEach(a-> System.out.println(a));
    }

    private static List<String> sort(List<String> list) {
        List<String> ordered = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (ordered.size() == 0) {
                    ordered.add(list.get(i));
                    break;
                }

                if (j < ordered.size()) {
                    if (ordered.get(j).compareTo(list.get(i)) > 0) {
                        ordered.add(j, list.get(i));
                        break;
                    }
                } else {
                    ordered.add(list.get(i));
                    break;
                }
            }
        }

        return ordered;
    }
}

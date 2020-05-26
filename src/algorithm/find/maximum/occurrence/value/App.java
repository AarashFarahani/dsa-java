package algorithm.find.maximum.occurrence.value;

import java.util.HashMap;
import java.util.Map;

public class App {
    private final static String STR = "zf3kabxcde224lkzf3mabxc51+crsdtzf3nab=";

    public static void main(String[] args) {
        Map<String, Integer> result = findOccurrence(STR, 3);
        result.forEach((k, v)-> System.out.println(String.format("%s | %s", k, v)));
    }

    private static Map<String, Integer> findOccurrence(String str, int patternLength) {
        Map<String, Integer> map = new HashMap<>();
        if (str == null || str.equals(""))
            return map;
        if (patternLength <= 0)
            return map;

        for (int i = 0; i < str.length() - patternLength + 1; i++) {
            String pattern = str.substring(i, i + patternLength);
            if (!map.containsKey(pattern)) {
                int occurrence = 0;
                int index = 0;

                do {
                    occurrence++;
                    index = str.indexOf(pattern, index);
                    index += patternLength;
                } while (str.indexOf(pattern, index) != -1);

                if(occurrence > 1)
                    map.put(pattern, occurrence);
            }
        }

        return map;
    }
}

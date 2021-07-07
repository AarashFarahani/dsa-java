package hackerrank.amazon.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.sort(List.of("banana", "apple", "orange", "apple")));
    }

    private List<String> sort(List<String> transactions) {
        if(transactions == null || transactions.size() == 0)
            return transactions;

        Map<String, Integer> map = new HashMap();
        for (String t : transactions) {
            var count = map.get(t);
            count = count == null ? 1 : count + 1;
            map.put(t, count);
        }

        List<String> keys = map.keySet().stream().sorted().collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        for (String key : keys) {
            result.add(String.format("%s %s", key, map.get(key)));
        }

        return result;
    }
}

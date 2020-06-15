package hackerrank.count.routes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        var result = countRoutes(7, List.of(1, 3, 6, 2, 4));    //  3
//        var result = countRoutes(5, List.of(              //  3
//                6,
//                2,
//                6,
//                2,
//                3,
//                4,
//                8));

//        var result = countRoutes(3, List.of(              //  2
//                4,
//                1,
//                3,
//                6,
//                4));
        System.out.println(result);
    }

    public static int countRoutes(int fuel, List<Integer> cities) {
        boolean hasMorePossibleRoute = true;
        Set<Stack> possiblePath = new HashSet<>();

        while(hasMorePossibleRoute) {
            int tempFuel = fuel;
            Stack path = new Stack();
            path.push(cities.get(0));

            for(int i = 1; i < cities.size() && tempFuel > 0; i++) {
                int cost = Math.abs(cities.get(i - 1) - cities.get(i));
                if(cost > tempFuel)
                    continue;

                path.push(cities.get(i));

                if(possiblePath.contains(path)) {
                    path.pop();
                    continue;
                }

                tempFuel -= cost;
            }

            if(path.size() > 1)
                possiblePath.add(path);
            else
                hasMorePossibleRoute = false;
        }

        return possiblePath.size();
    }
}

package hackerrank.sorting.comparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class App {


    public static void main(String[] args) {
        Player[] player = new Player[] {
                new Player("amy", 100),
                new Player("david", 100),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150)
        };
        Checker checker = new Checker();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

//        // ************ Lambda way
//        Comparator<Player> comparator = (a, b) -> b.score - a.score;
//        comparator.thenComparing(a -> a.name);
//        Arrays.sort(player, comparator);
//
//        for(int i = 0; i < player.length; i++){
//            System.out.printf("%s %s\n", player[i].name, player[i].score);
//        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if(a.score == b.score)
            return a.name.compareTo(b.name);
        else
            return b.score - a.score;
    }
}

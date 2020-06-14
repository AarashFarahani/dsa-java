package algorithm.gas.station.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GasStationQueue {
    public static void main(String[] args) {
        fill(new int[] { 40, 50, 30, 70, 40, 80, 50, 50, 80, 60, 50 },
                new int[] { 2, 2, 1, 3 });
    }

    private static void fill(int[] cars, int[] stations) {
        Comparator<Station> carTank = Comparator.comparingInt(a-> a.tank);
        Comparator<Station> carPriority = (a, b)-> b.priority - a.priority;
        Queue<Station> stationQueue = new PriorityQueue<>(carTank.thenComparing(carPriority));
//        Queue<Station> stationQueue = new PriorityQueue<>(new StationComparator());

        for (int item : stations) {
            stationQueue.add(new Station(stations[item]));
        }

        int i = 0;
        while (!stationQueue.isEmpty() && i < cars.length) {
            Station station = stationQueue.poll();
            station.tank += cars[i++];
            stationQueue.add(station);
        }

        while (!stationQueue.isEmpty())
            System.out.println(stationQueue.poll());
    }
}

class Station {
    public Station(int priority) {
        this.priority = priority;
    }

    int priority;
    int tank;

    public String toString() {
        return String.format("Tank: %s | Priority: %s", this.tank, this.priority);
    }
}

class StationComparator implements Comparator<Station> {
    @Override
    public int compare(Station o1, Station o2) {
        int tankComparator = o1.tank - o2.tank;
        int priorityComparator = o2.priority - o1.priority;

        if (tankComparator == 0) {
            return priorityComparator == 0 ? tankComparator : priorityComparator;
        } else {
            return tankComparator;
        }
    }
}

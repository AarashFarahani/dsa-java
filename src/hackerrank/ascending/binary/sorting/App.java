package hackerrank.ascending.binary.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        printAll(rearrange(List.of(5, 5, 3, 7, 10, 14))); //  3 5 10 7 14
        System.out.println("*********************************************");
        printAll(rearrange(List.of(1, 2, 3))); //  1 2 3
    }

    private static void printAll(List<Integer> result) {
        result.forEach(a-> System.out.println(a));
    }

    public static List<Integer> rearrange(List<Integer> elements) {
        // Write your code here
        List<DecBin> result = new ArrayList<>();
        for (Integer item : elements) {
            result.add(new DecBin(Integer.toBinaryString(item), item));
        }

        result.sort(new DecBin());

        return result.stream().map(a-> a.getDecimal()).distinct().collect(Collectors.toList());
    }
}

class DecBin implements Comparator<DecBin> {
    private String binary;
    private Integer decimal;

    public DecBin(String binary, Integer decimal) {
        this.binary = binary;
        this.decimal = decimal;
    }

    public DecBin() {
    }

    public String getBinary() {
        return this.binary;
    }

    public void setBinary(String value) {
        this.binary = value;
    }

    public Integer getDecimal() {
        return this.decimal;
    }

    public void setDecimal(Integer value) {
        this.decimal = value;
    }

    @Override
    public int compare(DecBin o1, DecBin o2) {
        int result = (int)(o1.getBinary().chars().filter(ch -> ch == '1').count()
                - o2.getBinary().chars().filter(ch -> ch == '1').count());

        if(result == 0)
            result = o1.getDecimal().compareTo(o2.getDecimal());

        return result;
    }
}

package datastructure.array;

public class Program {
    public static void main(String[] args) {
        int[] charCount = new int[26];
        charCount['c' - 'a'] = 1;
        charCount['b'] = 1;
        charCount['c'] = 1;

        System.out.println(charCount['a']);
        System.out.println(charCount['b']);
        System.out.println(charCount['c']);
    }
}

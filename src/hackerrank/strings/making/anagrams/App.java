package hackerrank.strings.making.anagrams;

public class App {
    public static void main(String[] args) {
        System.out.println(makeAnagram("cdea", "abc"));
    }

    static int makeAnagram(String a, String b) {
        int[] lettercounts = new int[26];
        for(char c : a.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : b.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }
}

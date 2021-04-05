package leetcode.palindrome.number;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.isPalindrome(121));  //  true
        System.out.println(app.isPalindrome(-121));  //  false
        System.out.println(app.isPalindrome(10));  //  false
        System.out.println(app.isPalindrome(-101));  //  false
        System.out.println(app.isPalindrome(0));
        System.out.println(app.isPalindrome(1221));
    }

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int min = 0;
        int max = str.length() - 1;

        while (min < max) {
            if(str.charAt(min++) != str.charAt(max--))
                return false;
        }

        return true;
    }
}

package leetcode.implement.strStr;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.strStr("hello", "ll"));          //  2
        System.out.println(app.strStr("aaaaa", "bba"));         //  -1
        System.out.println(app.strStr("", ""));                  //  0
        System.out.println(app.strStr("a", ""));                 //  0
        System.out.println(app.strStr("mississippi", "issip"));  //  4
        System.out.println(app.strStr("mississippi", "issi"));   //  1
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}

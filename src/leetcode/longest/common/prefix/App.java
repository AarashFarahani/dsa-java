package leetcode.longest.common.prefix;

public class App {
    public static void main(String[] args) {
        App app = new App();
//        System.out.println(app.longestCommonPrefix("flower","flow","flight"));  //  "fl"
        System.out.println(app.longestCommonPrefix("dog","racecar","car"));  //  ""
    }

    public String longestCommonPrefix(String... strs) {
        if(strs == null || strs.length == 0 || strs.length > 200)
            return "";

        StringBuilder sb = new StringBuilder();
        String result = "";
        int i = 0, j = 0;
        while (i < strs.length && j < strs[i].length()) {
            if (i == 0) {
                sb.append(strs[i].charAt(j));
            }
            if (i < strs.length - 1) {
                if (strs[i].startsWith(sb.toString())) {
                    i++;
                    continue;
                } else
                    return result;
            } else {
                if (strs[i].startsWith(sb.toString()))
                    result = sb.toString();

                i = 0;
                j++;
            }
        }

        return result;
    }
}

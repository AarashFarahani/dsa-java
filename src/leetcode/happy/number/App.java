package leetcode.happy.number;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.isHappy(19));            //  true
        System.out.println(app.isHappy(2));             //  false
    }

    public boolean isHappy(int n) {
        if(n == 1)
            return true;
        if(n <= 6)
            return false;

        int sum = 0;
        while (n >= 10) {
            int m = n % 10;
            sum += Math.pow(m, 2);
            n /= 10;
        }

        sum += Math.pow(n, 2);

        return isHappy(sum);
    }
}

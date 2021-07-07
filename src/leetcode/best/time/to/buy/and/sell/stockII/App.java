package leetcode.best.time.to.buy.and.sell.stockII;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.maxProfit(new int[]{7,1,5,3,6,4}));      //  7
        System.out.println(app.maxProfit(new int[]{1,2,3,4,5}));        //  4
        System.out.println(app.maxProfit(new int[]{7,6,4,3,1}));        //  0
    }

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;

        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i - 1];
            }
        }

        return result;
    }
}

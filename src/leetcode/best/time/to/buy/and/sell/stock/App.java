package leetcode.best.time.to.buy.and.sell.stock;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.maxProfit(new int[] {7,1,5,3,6,4}));         //  5
        System.out.println(app.maxProfit(new int[] {7,6,4,3,1}));           //  0
        System.out.println(app.maxProfit(new int[] {7,2,3,2,5}));           //  3
        System.out.println(app.maxProfit(new int[] {1,2,4}));               //  3
        System.out.println(app.maxProfit(new int[] {1,2,4,2,8}));           //  7
        System.out.println(app.maxProfit(new int[] {1,2,4,0,8}));           //  8
        System.out.println(app.maxProfit(new int[] {2,1,2,0,1}));           //  1
        System.out.println(app.maxProfit(new int[] {1,4,2}));               //  3
        System.out.println(app.maxProfit(new int[] {2,1,2,1,0,1,2}));       //  2
    }

    public int maxProfit(int[] prices) {
        int ans=0;
        if (prices.length == 0) {
            return ans;
        }

        int bought = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bought) {
                if (ans < (prices[i] - bought)) {
                    ans = prices[i] - bought;
                }
            } else {
                bought = prices[i];
            }
        }
        return ans;
    }

//    public int maxProfit(int[] prices) {
//        if(prices == null || prices.length <= 1)
//            return 0;
//        if (prices.length == 2) {
//            int diff = prices[1] - prices[0];
//            return diff < 0 ? 0 : diff;
//        }
//
//        int tempMin = Math.min(prices[0], prices[1]);
//        int tempMax = 0;
//        int min = -1, max = -1;
//        boolean found = false;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] > prices[i - 1]) {
//                found = true;
//                if (prices[i - 1] < tempMin) {
//                    tempMin = prices[i - 1];
//                    tempMax = prices[i];
//                }
//                if(prices[i] > tempMax)
//                    tempMax = prices[i];
//                if(prices[i] > max)
//                    max = prices[i];
//            }
//
//            if(found && min == -1)
//                min = tempMin;
//
//            if ((tempMax - tempMin) > (max - min)) {
//                min = tempMin;
//                max = tempMax;
//            }
//        }
//
//        return max - min;
//    }
}

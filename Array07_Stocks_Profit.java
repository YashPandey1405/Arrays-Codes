public class Array07_Stocks_Profit {
    public static void stocks(int arr[]) { // Function Code To Solve Sell And Profit DSA Question....
        int n = arr.length;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < n; i++) {
            if (buyprice < arr[i]) {
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = arr[i];
            }
        }
        System.out.println("THE MAX PROFIT WILL BE ::: " + maxprofit);
    }

    public static void main(String args[]) {
        // int arr[]={4,2,0,6,3,2,5};
        // stocks(arr);
    }
}

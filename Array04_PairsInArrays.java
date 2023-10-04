public class Array04_PairsInArrays {
    // Function To Print All Paris Of Each Element Of The Given Array......
    public static void pairs(int arr[]) { // Function Code To Print The Unique Pairs Of The Array.....
        int n = arr.length;
        for (int i = 0; i < n; i++) { // Loop To Select The 1st Element Of The Unique Pair....

            if (i == (n - 1)) { // As ,There Will Be No-Pair For The Last Element Of The Array.....
                break;
            }

            System.out.print("THE UNIQUE PAIRS OF " + arr[i] + " ARE ::: { ");
            for (int j = (i + 1); j < n; j++) { // Loop To Select The 2nd Element Of The Unique Pair....
                if (j == (n - 1)) {
                    int PairCount = (arr.length - 1 - i);
                    // Line To Print The Unique Pairs Of The Array....
                    System.out.println("(" + arr[i] + "," + arr[j] + ") }  --> " + PairCount + " Pairs");
                    break;
                }
                // Line To Print The Unique Pairs Of The Array.....
                System.out.print("(" + arr[i] + "," + arr[j] + ") ,");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        pairs(arr);
    }
}

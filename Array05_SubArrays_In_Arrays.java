public class Array05_SubArrays_In_Arrays {

    // Function Code To Print All Possible Sub-Arrays....
    public static void Print_SubArrays(int arr[]) { // O(n^3) --> V.Poor......
        int n = arr.length, TotalSubArray = 0;
        for (int i = 0; i < n; i++) { // Loop To Select The 1st Element For The Sub-Array Of That Element...
            System.out.print("THE SUB-ARRAY OF " + arr[i] + " ARE ::: [ ");
            for (int j = i; j < n; j++) { // Loop To Select The Range Of Elements For The Sub-Array Of That Element...
                int start = i, end = j;
                System.out.print("{");
                while (start <= end) { // Loop To Print The Range Of Elements For The Sub-Array Of That Element...
                    if (j == (n - 1) && start == end) {
                        System.out.print(arr[start] + "} ]");
                        TotalSubArray++;
                        break;
                    }
                    if (start == end) {
                        System.out.print(arr[start] + "} , ");
                        TotalSubArray++;
                        break;
                    }
                    System.out.print(arr[start] + ",");
                    start++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("THE TOTAL NUMBER OF SUB-ARRAYS ARE ::: " + TotalSubArray);
    }

    // Brute Force Approach To Print & Perform MaxSum & MinSum In The SubArray......
    public static void BruteForceMethod(int arr[]) { // O(n^3) --> V.Poor.....
        int n = arr.length, TotalSubArray = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) { // Loop To Select The 1st Element For The Sub-Array Of That Element...
            int start = i;
            System.out.print("THE SUB-ARRAYS OF " + arr[i] + " ARE ::: [ ");
            for (int j = i; j < n; j++) { // Loop To Select The Range Of Elements For The Sub-Array Of That Element...
                int end = j, sum = 0;
                System.out.print("{");

                // Loop To Print The Range Of Elements For The Sub-Array Of That Element.....
                for (int k = start; k <= end; k++) {
                    if (j == (n - 1) && k == end) {
                        System.out.println(arr[k] + "} ]");
                    } else if (k == end) {
                        System.out.print(arr[k] + "} , ");
                    } else {
                        System.out.print(arr[k] + ",");
                    }
                    sum = sum + arr[k];
                }
                // Statement To Evaluate The Max. & Min. Sum Of Sub-Array......
                max = (sum > max) ? sum : max;
                min = (sum < min) ? sum : min;
                TotalSubArray++;
            }
        }
        System.out.println();

        System.out.println("THE TOTAL NUMBER OF SUB-ARRAYS ARE ::: " + TotalSubArray);
        System.out.println("THE MAXIMUM SUM OF SUB-ARRAY IN THE ARRAY IS ::: " + max);
        System.out.println("THE MINIMUM SUM OF SUB-ARRAY IN THE ARRAY IS ::: " + min);
    }

    // Perfix Sum Method To Perform Operations On SubArray.....
    public static void PrefixSumMethod(int arr[]) { // Time Complexity Is O(n^2).....
        int n = arr.length, TotalSubArray = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int prefix[] = new int[n]; // We Created The Prefix Array Here....
        // prefix[i] --> Sum Of Elements From arr[0] To arr[i] Of Array.....
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) { // Loop To Fill The Prefix Array....
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) { // Loop To Select The 1st Element For The Sub-Array Of That Element...
            int start = i;
            for (int j = i; j < n; j++) { // Loop To Select The 2nd Element For The Sub-Array Of That Element...
                int end = j, sum = 0;
                sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1]; // Ternary Operator...
                // Statement To Evaluate The Max. & Min. Sum Of Sub-Array......
                max = (sum > max) ? sum : max;
                min = (sum < min) ? sum : min;
                TotalSubArray++;
            }
        }
        System.out.println();

        System.out.println("THE TOTAL NUMBER OF SUB-ARRAYS ARE ::: " + TotalSubArray);
        System.out.println("THE MAXIMUM SUM OF SUB-ARRAY IN THE ARRAY IS ::: " + max);
        System.out.println("THE MINIMUM SUM OF SUB-ARRAY IN THE ARRAY IS ::: " + min);
    }

    // Kadane's Algorithm To Find Max. & Min. Sum In SubArray Of A Given Array.....
    public static void KadanesAlgorithm(int arr[]) { // Time Complexity Is O(n).....
        int max = Integer.MIN_VALUE;
        int n = arr.length, CurrentValue = 0, NegativeCount = 0;

        for (int i = 0; i < n; i++) { // Loop To Count (-) Elements Of Array....
            if (arr[i] < 0) {
                NegativeCount++;
            }
        }

        // Special Case Of Kadane's Algorithm.....
        if (NegativeCount == n) { // When All Elements Of Array Are (-)...
            // When All Elements Of Array Are (-),Then , The Smallest (-) Number Will Be
            // The Max. Value Among All The Elemets Of Array...
            for (int i = 0; i < n; i++) {
                // The Smallest (-) Number Will Be The Max. Value...
                max = (arr[i] > max) ? arr[i] : max;
            }
        } else {
            for (int i = 0; i < n; i++) { // Loop To Calculate The Max. Sum Of Sub-Array....
                CurrentValue += arr[i];
                // If The CurrentValue is (-),Then, CurrentValue=0....
                CurrentValue = (CurrentValue < 0) ? 0 : CurrentValue;
                max = Math.max(CurrentValue, max); // Inbuilt Function To Get Greater Value b/w Currentvalue And max....
            }
        }
        System.out.println("THE MAXIMUM SUM OF SUB-ARRAY IN THE ARRAY IS ::: " + max);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        // Print_SubArrays(arr);
        // BruteForceMethod(arr);

        // Print_SubArrays(arr);
        // PrefixSumMethod(arr);

        // Print_SubArrays(arr);
        // KadanesAlgorithm(arr);

    }
}
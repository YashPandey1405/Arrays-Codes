/*
 * Given n non-negative integers representing an elevation map where the width of
    each bar is 1, compute how much water it can trap after raining.
*/

public class Array10_PracticeQuestion3 {
    public static int TrappedWater(int arr[]) {
        int TotalWater = 0;
        int Left = 0, Right = arr.length - 1;
        int LeftMax = arr[Left], RightMax = arr[Right];
        while (Left < Right) {
            if (LeftMax < RightMax) {
                Left++;
                LeftMax = Math.max(LeftMax, arr[Left]);
                TotalWater += LeftMax - arr[Left];
            } else {
                Right--;
                RightMax = Math.max(RightMax, arr[Right]);
                TotalWater += RightMax - arr[Right];
            }
        }
        return TotalWater;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 2, 1, 3, 2, 4, 1, 4 }; // Water Stored=5......
        int ans = TrappedWater(arr);
        System.out.println("THE MAX. TRAPPED WATER WILL BE ::: " + ans);
    }
}

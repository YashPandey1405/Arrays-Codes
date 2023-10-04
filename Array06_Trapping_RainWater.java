public class Array06_Trapping_RainWater {

    // Function Code To Solve Trapped Water DSA Question....
    public static void TrappedWater(int arr[]) {
        int n = arr.length;

        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) { // Loop To Fill LeftMax[] Array......
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = (n - 2); i >= 0; i--) { // Loop To Fill RightMax[] Array......
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int height = Math.min(leftmax[i], rightmax[i]);
            int waterlevel = height - arr[i];
            sum = sum + waterlevel;
        }
        System.out.println("THE WATER STORED IS ::: " + sum);
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        TrappedWater(arr);
    }
}

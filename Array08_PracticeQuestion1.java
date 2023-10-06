/*
*  Practice Question 1 : -
* Given an integer array nums, return true if any value appears at least twice in the array,
 *  and return false if every element is distinct.
*/

public class Array08_PracticeQuestion1 {
    public static boolean CheckDuplicate(int arr[]) {
        int count[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int Curr = arr[i];
            if (count[Curr] == 0) {
                count[Curr]++;
            } else if (count[Curr] > 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 3 };
        boolean ans = CheckDuplicate(arr);
        System.out.println("THE ARRAY CONTAINS DUPLICATE ::: " + ans);
    }
}

/*
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
 * index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  
 * is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).
 * For   example, [0,1,2,4,5,6,7] might be rotated at pivot index-3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, return the index of target
 * if it is in nums, or -1 if it is not in nums.

 * IMP --> You must write an algorithm with O(log n) runtime complexity......
*/

public class Array09_PracticeQuestion2 {

    public static int Search_Pivot(int arr[]) {
        int Start = 0, End = arr.length - 1;
        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            // Case 1......
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                return mid;
            }
            // Case 2......
            else if (arr[Start] < arr[mid] && arr[mid] > arr[End]) {
                Start = mid + 1;
            } else {
                End = mid - 1;
            }
        }
        return Start;
    }

    public static int BinarySearch(int arr[], int Start, int End, int Target) {
        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            if (arr[mid] == Target) {
                return mid;
            } else if (arr[mid] < Target) {
                Start = mid + 1;
            } else {
                End = mid - 1;
            }
        }
        return -1;
    }

    public static int Search(int arr[], int Target) {
        int n = arr.length;
        int Pivot = Search_Pivot(arr);
        if (arr[Pivot] <= Target && Target <= arr[n - 1]) {
            // Binary Search For Target In {Pivot-->(n-1)} Of The Array.....
            return BinarySearch(arr, Pivot, n - 1, Target);
        } else {
            // Binary Search For Target In {0-->Pivot} Of The Array.....
            return BinarySearch(arr, 0, Pivot, Target);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 }; // Rotated About Pivot-(0)......
        int Target = 0;
        int ans = Search(arr, Target);
        System.out.println("THE INDEX OF " + Target + " IN THE ROTATED SORTED ARRAY IS ::: " + ans);
    }
}

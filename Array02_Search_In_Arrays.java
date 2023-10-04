public class Array02_Search_In_Arrays {
    // Time Complexity Of Linear Search Is O(n).....
    public static int LinearSearch(int arr[], int key) { // Function Code For Linear Search....
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Time Complexity Of Binary Search Is O(Logn).....
    public static int BinarySearch(int arr1[], int key) { // Function Code For Binary Search....
        int n = arr1.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr1[mid] == key) {
                return mid;
            }
            if (arr1[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void PrintArray(int arr[]) { // Function Code For Print The Array....
        System.out.print("THE ARRAY IS ::: {");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                System.out.println(arr[i] + " }");
                break;
            }
            System.out.print(arr[i] + " , ");
        }
    }

    public static void main(String args[]) {
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 7;
        PrintArray(arr2);
        System.out.println();

        int index = LinearSearch(arr2, key);
        if (index == -1) {
            System.out.println("KEY " + key + " NOT FOUND IN THE ARRAY");
        } else {
            System.out.println("By Linear Search ::: KEY " + key + " FOUND IN THE ARRAY AT INDEX ::: " + index);
        }

        int index2 = BinarySearch(arr2, key);
        if (index2 == -1) {
            System.out.println("KEY " + key + " NOT FOUND IN THE ARRAY");
        } else {
            System.out.println("By Binary Search ::: KEY " + key + " FOUND IN THE ARRAY AT INDEX :::" + index2);
        }
    }
}

public class Array03_Basic_Operations {
    // Function To Find Largest Element In The Array......
    public static void Find_Largest(int arr[]) { // O(n)......
        int n = arr.length;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        System.out.println("THE LARGEST ELEMENT IN THE ARRAY IS ::: " + Max);
    }

    // Function To Find Smallest Element In The Array......
    public static void Find_Smallest(int arr[]) { // O(n)......
        int n = arr.length;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("THE MIN ELEMENT IN THE ARRAY IS ::: " + Min);
    }

    // Function To Reverse The Given Array.....
    public static void Reverse_Array(int arr[]) { // O(n/2)=O(n)......
        int Start = 0, End = arr.length - 1;
        while (Start < End) {
            int Temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = Temp;
            Start++;
            End--;
        }
        System.out.print("After Reverse_Array() Function ::: ");
        PrintArray(arr);
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
        int arr[] = { 3, 2, 5, 7, 8, 4 };
        PrintArray(arr);
        System.out.println();

        Find_Largest(arr);
        Find_Smallest(arr);
        Reverse_Array(arr);
    }
}

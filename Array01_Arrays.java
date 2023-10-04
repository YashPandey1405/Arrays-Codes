import java.util.*;

public class Array01_Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS IN YOUR ARRAY ::: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; // Declaration Of Array In Java.....
        for (int i = 0; i < n; i++) {
            System.out.print("ENTER THE ELEMENT " + (i + 1) + " ::: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("THE ARRAY IS ::: { ");
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                System.out.print(arr[i] + " }");
                break;
            }
            System.out.print(arr[i] + " , ");
        }
    }
}

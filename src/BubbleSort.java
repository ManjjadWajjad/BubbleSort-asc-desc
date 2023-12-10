/*Nama : Muhammad Faisal Muzhaffar
 *NIM  : 20230040125
  Kelas: 23TIC 
 */
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Ascending (1) atau Descending (2): ");
        String input = inputan.next(); 

        int[] arr = { 15, 11, 13, 7, 1 };
        int n = arr.length;
        bubbleSort(arr, n, input);
        printArray(arr, n);
    }

    static void bubbleSort(int arr[], int n, String input) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (input.equals("1")) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                } else if (input.equals("2")) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
            if (!swapped)
                break;
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

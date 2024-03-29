import java.util.Scanner;

public class THB1_1 {
    static int[] ReArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static double AveArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (arr.length);
    }

    static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] inputArray(String[] args) {
        int[] arr = new int[args.length];
        int i = 0;
        for (String a : args) {
            arr[i] = Integer.parseInt(a);
            i++;
        }
        return arr;
    }

    public static void main(String[] args){
        int n = args.length;
        int[] arr = new int[n];
        arr = inputArray(args);
        System.out.print("mang ban dau: ");
        traverse(arr);
        arr = ReArr(arr);
        System.out.print("\nmang sau khi sap xep: ");
        traverse(arr);
        System.out.print("\ntrung binh cua day: " + AveArr(arr));
    }
}


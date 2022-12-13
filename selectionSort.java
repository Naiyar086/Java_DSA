public class selectionSort {
    public static void selectSort(int arr[]) {
        for (int pass = 1; pass <= arr.length - 1; pass++) {
            int position = pass - 1;
            int min_index = position;
            for (int i = position; i < arr.length; i++) {
                if (arr[i] < arr[min_index]) {
                    min_index = i;
                }
            }
            swap(arr, min_index, position);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 8, 3, 2, 99, 97, 7, 9, 6 };
        selectSort(arr);
        display(arr);
    }
}

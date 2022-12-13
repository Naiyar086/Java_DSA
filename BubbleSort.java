class BubbleSort {
    public static void bubbleSorting(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {  //Just change the order it will be in inc or dec.
                    swap(arr, j, j - 1);
                    flag = true;
                }
            }
            if (flag == false)
                break;
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
        int arr[] = { 4, 5, 6, 8, 2, 3, 89, 9, 1, 45 };
        bubbleSorting(arr);
        display(arr);
    }
}

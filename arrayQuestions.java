public class arrayQuestions {
    public static void printSpiral(int arr[][]) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int count = 0;
        while (count < arr.length * arr[0].length) {
            for (int i = minr; i <= maxr; i++) 
                System.out.println(arr[i][minc]);
                minc++;
            
            for (int i = minc; i <= maxr; i++) 
                System.out.println(arr[maxr][i]);
                maxr--;
            
            for (int i = maxr; i >= minr; i--) {
                System.out.println(arr[i][maxc]);
                maxc--;
            
            for (int i = maxc; i >= minc; i--) 
                System.out.println(arr[minr][i]);
                minr++;
            
            count++;
        }
    }

    public static void main(String[] args) {

        int arr2[][] = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 11, 12, 13, 14 }, { 16, 17, 18, 19 } };
        printSpiral(arr2);
    }

}

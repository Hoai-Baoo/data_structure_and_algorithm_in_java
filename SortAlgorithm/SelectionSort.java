public class SelectionSort {
    public static void main(String[] args) {
        
        // selection sort = search through an array and keep track of the minium value during
        //                  each iteration. At the end of each teration, we swap variables.

        //                  Quadratic time O(n^2)
        //                  Large dataset = Bad
        int[] arr = {9,1,8,2,7,3,6,4,5};

        selectionSort(arr);
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        int len = arr.length;
        // int min=arr[0];
        for (int i=0; i<len; i++) {
            for (int j=i+1; j<len;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}

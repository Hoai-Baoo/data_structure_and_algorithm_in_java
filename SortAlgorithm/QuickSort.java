
public class QuickSort {
    public static void main(String[] args) {
        
        int[] arr = {8, 2, 4, 7 ,1 , 3, 9 ,6 ,5};

        quickSort(arr, 0, arr.length-1);
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end<=start)
            return; //base case
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        for (int element : arr)
            System.out.print(element + " ");
        System.out.println();
        
        int pivotValue = arr[end];
        int i = start-1;
        int j = start;
        while(arr[j] != pivotValue) {
            if (arr[j] < pivotValue) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
               
            j++;
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return i;
    }
}
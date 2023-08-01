public class MergeSort {
    
    public static void main(String[] args) {
        // int[] arr = {8, 2, 4, 7 ,1 , 3, 9 ,6 ,5};
        int[] arr = {3, 7, 8, 5, 4, 2, 6, 1};

        mergeSort(arr);
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1)
            return; //base case
        int middle = length/2; // 8/2 = 4
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length-middle];

        //simple is copy content from arr to left and right array
        int i = 0; //leftArr
        int j = 0; //rightArr
        for (;i < length; i++) {
            if (i < middle) {
                leftArr[i] = arr[i]; 
            }
            else {
                rightArr[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr);
    }
    private static void merge(int[] arr,int[] leftArr, int[] rightArr) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int i=0, l=0, r=0;

        while(l<leftSize && r<rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            }
            else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while(l<leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while(r<rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
}

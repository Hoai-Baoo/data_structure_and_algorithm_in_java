public class BubbleSort {
    public static void main(String[] args) {
        
        // bubble sort = pairs of adjacent elements are compared, and the elements
        //               swapped if they are not in order
        
        //               Quadratic time O(n^2)
        //               Large dataset = bad
        int[] arr = {9,1,8,2,7,3,6,4,5};

        bubbleSort(arr);
        for (int i:arr){
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        // right to left
        int len = arr.length;
        for (int i=0; i<len; i++) {
            for (int j=0; j < len-1-i; j++) {
                for (int in:arr){
                    System.out.print(in + " ");
                }
                System.out.println();
                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("-----------");
        }
    }
}

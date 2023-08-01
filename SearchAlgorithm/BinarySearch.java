

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
    // Search algorithm that finds the position of a target value within a sorted array
    // Half of the array is eliminated each "step"
    // Runtime complexity: O(logn)

    int[] sortedArray = new int[1000000];
    int target = 777777;

    for(int i=0;i<sortedArray.length;i++){
        sortedArray[i] = i;
    }


    int index = binarySearch(sortedArray, target);
    if (index != -1) {
        System.out.println("target: " + index);
    }
    else {
        System.out.println("Not found");
    }
    }

    private static int binarySearch(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;
        
        while (low <= high) {
            int middle = low + (high-low)/2;
            int value = sortedArray[middle];

            System.out.println("Middle: " + value);
            if (value < target) {
                low = middle + 1;
            }
            else if(value > target) {
                high = middle - 1;
            }
            else {
                return middle; //target found
            }
        }
        return -1; //not found
    }

}


public class LinearSearch {
    public static void main(String[] args) {
        // linear search = interate through a collection one element at a time

        // runtime complexity: O(n)

        // Disadvantage?
        // Slow for large data sets

        // Advantage?
        // Fast for searches of small to medium data sets
        // Does not need to sorted
        // Useful for data structures that do not have random access (linked list)

        int[] array = {9,1,8,2,7,3,6,4,5};

        int index = linearSearch(array,19);

        if (index != -1) {
            System.out.println("Element found at index: "+ index);
        }
        else {
            System.out.println("Element not found");
        }

    }   

    private static int linearSearch(int[] array, int value) {

        for (int i=0; i<array.length; i++) {
            if (value == array[i])
            return i;
        }
        return -1;
    }
}

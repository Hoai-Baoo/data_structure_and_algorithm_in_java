

public class InterpolationSearch {
    
    public static void main(String[] args) {
        // Interpolation search = improvement over binary search best used for "uniformly" distributed data
        //                        "guesses" where a value might be based on calculated probe results
        //                        if probe is incorrected, search area is narrowed, and a new probe is calculated
        // Average case O(log(logn))
        // Worst case O(n) [Values increase exponentially]

        int[] array = new int[15];
        array[0] = 1;
        for(int i=1;i<array.length; ++i) {
            array[i] = array[i-1]*2;
        }

        for (int i:array) {
            System.out.print(i+" ");
        }
        System.out.println();

        int index = interpolationSearch(array,512);
        System.out.println("Result: " + index);
        
    }

    private static int interpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while( value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low)*(value - array[low]) / (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if (array[probe] == value) {
                return probe;
            }
            else if (array[probe] < value) {
                low = probe + 1;
            }
            else {
                high = probe - 1;
            }
        }
        return -1;
    }
}

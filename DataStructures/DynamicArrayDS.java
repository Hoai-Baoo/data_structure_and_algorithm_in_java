import java.util.*;
    
public class DynamicArrayDS {

    // Advantages:
    //  1. Random access of elements O(1)
    //  2. Good locality of reference and data cache utilization
    //  3. Easy to insert/delete at the end

    // Disadvantages:
    //  1. Waste more memory
    //  2. Shifting elements is time comsuming
    //  3. Expanding/Shrinking the array is time consuming

        int size=0;
        int capacity = 10;
        Object[] array;

        public DynamicArrayDS() {
            this.array = new Object[capacity];
        }  
        
        public DynamicArrayDS(int capacity) {
            this.capacity = capacity;
            this.array = new Object[capacity];
        }    

        public void add(Object data) {
            if (size >= capacity) {
                grow();
            }
            array[size] = data;
            size++;
        }

        public void insert(int index, Object data) {
            if (size >= capacity) {
                grow();
            }
            for (int i=size;i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = data; 
            size++;
        }

        public void delete(Object data) {
            boolean notFound=true;
            for (int i=0; i<size; i++) {
                if (array[i] == data) {
                    for (int j=0; j<(size-i-1); j++) {
                        array[i+j] = array[i+j+1];
                    }
                    array[size-1] = null;
                    size--;

                    if (size <=(int) (capacity/3)) {
                        shrink();
                    }
                    notFound=false;
                    break;
                }
            }
            
            if (notFound) {
                System.out.println("Not found " + data + " in array!");
            }
            
        }

        public int search(Object data) {

            for (int i=0; i<size; i++) {
                if(array[i] == data) {
                    return i;
                }
            }
            return -1;
        }

        private void grow() {
            int newCapacity = (int)(capacity * 2);
            Object[] newArray = new Object[newCapacity];

            for(int i=0; i<size; i++) {
                newArray[i] = array[i];
            }

            capacity = newCapacity;
            array = newArray;
        }

        private void shrink() {
            int newCapacity = (int)(capacity / 2);
            Object[] newArray = new Object[newCapacity];

            for(int i=0; i<size; i++) {
                newArray[i] = array[i];
            }

            capacity = newCapacity;
            array = newArray;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public String toString() {

            String string = "";

            for(int i=0; i<capacity; i++) {
                string += array[i] + ", ";
            }
            if (string != "") {
                string ="["+ string.substring(0, string.length()-2) + "]";
            }
            else {
                string = "[]";
            }
            return string;
        }
}

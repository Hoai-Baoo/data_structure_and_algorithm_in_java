public class Main {
    
    public static void main(String[] args) {
        
        DynamicArrayDS dynamicArr = new DynamicArrayDS(5);

        dynamicArr.add("A");
        dynamicArr.add("B");
        dynamicArr.add("C");
        dynamicArr.add("D");
        dynamicArr.add("E");
        dynamicArr.add("F");

        // dynamicArr.insert(0,"G");
        // dynamicArr.delete("D");
        // dynamicArr.delete("A");

        dynamicArr.delete("A");
        dynamicArr.delete("B");
        dynamicArr.delete("C");

        // System.out.println(dynamicArr.search("C"));

        System.out.println(dynamicArr.toString());
        System.out.println("size: " + dynamicArr.size);
        System.out.println("capacity: " + dynamicArr.capacity);
        System.out.println("empty: " + dynamicArr.isEmpty());
    }
}

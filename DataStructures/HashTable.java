import java.util.*;

public class HashTable {
    public static void main(String[] args) {

        // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //             Each key/value pair is known as an Entry
        //             FAST Insertion, look up, deletion of key/value pair
        //             Not ideal for small datasets, great with large datasets

        // hashing = takes a key and computes an integer (formula will vary based on key & data type)
        //           In a Hashtable, we use the hash % capacity to calculate an index number
        
        // key.hashCode() % capacity = index

        // Bucket = an indexed storage location for one or more Entries
        //          can store multiple Entries in case of a collision (linked similarly a linked list)
        
        // Runtime Complexity: Best Case O(1)
        //                     Worst Case O(n)
        
        Hashtable<String, String> table = new Hashtable<String, String>(21);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode()%21 + "\t" +key+ "\t" + table.get(key));
        }
    }
}

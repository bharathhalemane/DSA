// Pair in Java

import java.util.AbstractMap.SimpleEntry;

public class Class1 {
    public static void main(String[] args) {

        SimpleEntry<Integer, String> entry = new SimpleEntry<>(1, "one");

        // Accessing values
        Integer key = entry.getKey();
        String value = entry.getValue();

        // Printing the values
        System.out.println("Kye: "+ key + ", value: "+ value);

        // Equality Checks
        SimpleEntry<Integer, String> entry2 = new SimpleEntry<>(1, "one");
        System.out.println("Equality Checks: "+ entry.equals(entry2));

        // String Representation
        System.out.println(entry.toString());

        // HashCode
        System.out.println("Hash code: "+ entry.hashCode());

    }

}
    
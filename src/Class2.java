//ArrayList in Java


import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;

public class Class2 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // Add elements to the ArrayList
        integerArrayList.add(10);
        integerArrayList.add(1,20);
        integerArrayList.add(30);

        System.out.println("ArrayList: "+integerArrayList.toString());

        // Accessing Elements
        System.out.println("2nd element in ArrayList: "+ integerArrayList.get(1));

        // Modifying Elements
        System.out.println("Before modifying elements: " + integerArrayList.toString());
        integerArrayList.set(2, 40);
        System.out.println("After modifying elements: " + integerArrayList.toString());

        // Size and Capacity
        System.out.println("Size of an ArrayList: " + integerArrayList.size());
        
        // Removing elements
        System.out.println("Before removing elements: " + integerArrayList.toString());
        integerArrayList.remove(1);
        integerArrayList.remove(Integer.valueOf(40));
        System.out.println("after removing elements: " + integerArrayList.toString());

        // others
        integerArrayList.clear();
        System.out.println("after clearing all elements: " + integerArrayList.toString());

        System.out.println("ArrayList is Empty: " + integerArrayList.isEmpty());

        // ArrayList of SimpleEntry (last class)

        // Creation of ArrayList of SimpleEntry

        ArrayList<SimpleEntry<Integer, String>> listOfEntries = new ArrayList<>();

        // Adding entries to the ArrayList

        listOfEntries.add(new SimpleEntry<>(1, "One"));
        listOfEntries.add(new SimpleEntry<>(2, "Two"));
        listOfEntries.add(new SimpleEntry<>(3, "Three"));

        // Iterating over the ArrayList and accessing elements of SimpleEntry
        for(SimpleEntry<Integer, String> entry: listOfEntries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key:"+key+", Value:"+value);
        }
    }
}
    
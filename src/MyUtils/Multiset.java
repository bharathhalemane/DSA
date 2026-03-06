package MyUtils;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Multiset<E> {
    private Map<E, Integer> map = new TreeMap<>();

    //Add an element to the multiset
    public void add(E element){
        map.put(element, map.getOrDefault(element, 0) + 1);
    }

    // Add multiple instances of an element to the multiset
    public void add(E element, int occurrences){
        if(occurrences < 0) throw new IllegalArgumentException("Occurrences cannot be negative");
        map.put(element, map.getOrDefault(element, 0) + occurrences);
    }

    // Remove one occurrence of an element
    public void remove(E element){
        map.computeIfPresent(element, (key, count) -> count > 1 ? count - 1 : null);
    }

    // Remove multiple occurrences of an element
    public void remove(E element, int occurrences){
        if (occurrences < 0) throw  new IllegalArgumentException("Occurrences cannot be negative");
        map.computeIfPresent(element, (key, count) -> count > occurrences ? count - occurrences: null);
    }

    // Get the count of an element in the multiset
    public  int count(E element){
        return  map.getOrDefault(element, 0);
    }

    // Get the set of elements
    public Set<E> elementSet(){
        return map.keySet();
    }

    // Get the total size of the multiset
    public int size(){
        return map.values().stream().mapToInt(Integer::intValue).sum();
    }

    // Check if the multiset is empty
    public boolean isEmpty(){
        return map.isEmpty();
    }

    public String print(){
        StringBuilder result = new StringBuilder();

        result.append("[ ");
        map.keySet().forEach(element -> {
            for(int i=1; i<= map.getOrDefault(element, 0); i++){
                result.append(element + " ");
            }
        });
        result.append(" ]");
        return result.toString();
    }
}
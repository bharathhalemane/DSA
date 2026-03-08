/*

    1) Map
    2) MultiMap
    3) Unordered Map
    4) Algorithms
*/

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
//import org.apache.commons.lang3.StringUtils;

class MyMap{
    Map<Integer, String> map;

    MyMap(Map<Integer, String> map){
        this.map = map;
    }

    void callMapMethods(){

        // adding pairs into map
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        // Iterating entries
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // modifying pairs using keys
        map.put(2, "Emma");

        System.out.println(map.get(2));     // "Emma"

        if(map.containsKey(3)){
            System.out.println("Found: " + map.get(3)); // "Charlie"
        }

        //Iteration using lambda
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

class MyMultiMap{
    Map<Integer, List<String>> multiMap;

    MyMultiMap(Map<Integer, List<String>> multiMap){
        this.multiMap = multiMap;
    }

    void callMultiMapMethod(){

        // Adding value to the multiMap
        multiMap.put(1, new ArrayList<>());
        multiMap.get(1).add("Alice");
        multiMap.get(1).add("Ananth");

        multiMap.put(2, new ArrayList<>());
        multiMap.get(2).add("Bob");

        // Iterating over the multiMap
        for(Map.Entry<Integer, List<String>> entry: multiMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding another value to an existing key
        multiMap.get(1).add("Arnold");
        System.out.println("Updated values for key 1: " + multiMap.get(1));

        // Checking if a specific key exists
        if(multiMap.containsKey(2)){
            System.out.println("Found values for key 2: " + multiMap.get(2));
        }

        // Using lambda to iterate
        multiMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

class MyHashMap{
    HashMap<Integer, String> hashMap;

    MyHashMap(HashMap<Integer, String> hashMap){
        this.hashMap = hashMap;
    }

    void callHashMapMethods(){

        // Insertion
        hashMap.put(1, "Applie");
        hashMap.put(2, "Bob");
        hashMap.put(3, "Cherry");

        // Iterating over the HashMap
        for(HashMap.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+": " + entry.getValue());
        }

        // Removal
        hashMap.remove(2);

        System.out.println("Removing the key-value pair where the key is 2");

        //Search
        if(hashMap.containsKey(1)){
            System.out.println("Found: "+hashMap.get(1));
        }

        //Iterating using lambda
        hashMap.forEach((key, value)-> System.out.println(key+": "+value));
    }
}

// Algorithms

//Sorting an Array
class ArraySorter{
    int[] a;

    ArraySorter(int[] a){
        this.a = a;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

//Sorting a List
class ListSorter{
    ArrayList<Integer> v;

    ListSorter(ArrayList<Integer> v){
        this.v = v;
        Collections.sort(v);
        System.out.println(v);
    }
}

//Sorting a Subarray
class SubarraySorter{
    int[] a;
    int firstIndex, lastIndex;

    SubarraySorter(int[] a, int firstIndex, int lastIndex){
        this.a = a;
        this.firstIndex=firstIndex;
        this.lastIndex=lastIndex;

        Arrays.sort(a, firstIndex, lastIndex);
        System.out.println(Arrays.toString(a));
    }
}

//Sorting in Descending order
class DescendingSorter{
    Integer[] a;
    DescendingSorter(Integer[] a){
        this.a = a;
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}

//Custom Comparator
class Pair{
    int first;
    int second;

    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return "(" + first +", " + second +")";
    }
}

// using custom Pair class
class SortPairs{
    SortPairs(){
        Pair[] pairs = {
                new Pair(8, 4),
                new Pair(5, 2),
                new Pair(8, 6)
        };

        Arrays.sort(pairs, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2){
                if(p1.first != p2.first){
                    return Integer.compare(p1.first, p2.first);     // Ascending order for the first element
                }else{
                    return Integer.compare(p2.second, p1.second);   // Descending order for the second element
                }
            }
        });

        System.out.println(Arrays.toString(pairs));
    }
}


class BitCounter{
    int i;
    BitCounter(int i){
        this.i = i;

        System.out.println(Integer.bitCount(i));
    }
}

//Permutations
//class PermutationGenerator{
//    String str;
//    PermutationGenerator(String str){
//        this.str = str;
//        char[] chars = str.toCharArray();
//        Arrays.sort(chars);
//        str = new String(chars);
//
//        do{
//            System.out.println(str);
//            str = StringUtils.nextPermutation(str);
//        }while(str != null);
//    }
//}

//Finding Maximum Element
class MaximumFinder{
    Integer[] a;
        MaximumFinder(Integer[] a){
            this.a =a;
            int max = Collections.max(Arrays.asList(a));
            System.out.println(max);
        }
}



public class Class4 {
    public static void main(String[] args) {
        MyMap myMap = new MyMap(new HashMap<>());   // declares a Map using Map and HashMap classes
        MyMultiMap myMultiMap = new MyMultiMap(new HashMap<>());    // declares a multimap using Map and HashMap classes
        MyHashMap hashMap = new MyHashMap(new HashMap<>());

        // calling Map Methods
        myMap.callMapMethods();

        // calling MultiMap methods
        myMultiMap.callMultiMapMethod();

        // calling HashMap methods
        hashMap.callHashMapMethods();


        // Algorithms using
        int[] arr = {13, 5, 17, 9, 70, 43, 15};

        //Sorting an Arrays
        ArraySorter arraySorter=new ArraySorter(arr);

        //Sorting a List
        ListSorter listSorter=new ListSorter(new ArrayList<>(Arrays.asList(7, 5, 10)));

        //Sorting a Subarray
        SubarraySorter subarraySorter=new SubarraySorter(arr, 2, 3);

        //Descending Sorting
        Integer[] a={13, 5, 17, 9, 70, 43, 15};
        DescendingSorter descendingSorter=new DescendingSorter(a);

        //Comparator
        SortPairs sortPairs=new SortPairs();

        //BitCounter
        BitCounter bitCounter=new BitCounter(5);

//        PermutationGenerator permutationGenerator=new PermutaitonGenerator("bharath");

        //Finding Maximum Element
        MaximumFinder maximumFinder=new MaximumFinder(a);

    }
}
    
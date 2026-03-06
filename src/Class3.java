import java.util.*;
import MyUtils.Multiset;

/*
      1) Deque
      2) List
      3) Stack
      4) Queue
      5) Priority Queue
            |
            |-- Max Heap or Max Priority Queue
            |
            |-- Mini Heap or Mini Priority queue
      6) Set
            |
            |-- LinkedHashSet
            |
            |-- TreeSet
      7) Multi-Set
      8) Unordered Set
*/

// Deque

class MyDeque{
    Deque<Integer> myDeque;

    MyDeque(Deque<Integer> myDeque){
        this.myDeque = myDeque;
    }

    void callDequeMethods(){

        // Adding Elements
        myDeque.addFirst(1);
        myDeque.addLast(2);
        myDeque.offerFirst(3);
        myDeque.offerLast(4);

        System.out.println(myDeque);

        // Accessing Elements
        System.out.println("First Element: " + myDeque.getFirst());
        System.out.println("Last Element: " + myDeque.getLast());

        // Removing Elements
        myDeque.removeFirst();  // Removes the first element
        myDeque.removeLast();   // Removes the last element

        // Iterating over Deque
        System.out.println("Elements in Deque:");
        for(int element : myDeque){
            System.out.print(element + " ");
        }


        System.out.println("\n\n");
    }
}

// List

class MyList{
    LinkedList<Integer> myList;

    MyList(LinkedList<Integer> myList){
        this.myList = myList;
    }

    void callingLinkedListMethods(){

        // Adding elements to the list
        myList.addLast(1);
        myList.addFirst(2);
        myList.addLast(3);
        myList.addFirst(4);
        myList.add(5);

        System.out.println("Added elements in the list" + myList);     // printing list

        // Removing elements from the list

        myList.remove();                                               // It removes the first element
        myList.removeLast();                                           // It removes the last element
        myList.removeFirst();                                          // It also removes the first element
        System.out.println("After removing elements in the list" + myList);

        // Accessing elements
        System.out.println("First Element : " + myList.getFirst());
        System.out.println("Last Element : " + myList.getLast());


    }
}

// Stack

class MyStack{
    Stack<Integer> myStack;

    MyStack(Stack<Integer> myStack){
        this.myStack = myStack;
    }

    void callStackMethods(){

        // Push elements onto the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Display the top element
        System.out.println("Top element: " + myStack.peek());

        // Pop an element from the stack
        myStack.pop();

        // check if the stack is empty
        System.out.println(myStack.empty() ? "Stack is empty." : "Stack is not empty.");

        // Display the size of the stack
        System.out.println("Size of stack: " + myStack.size());

        // Search for an element
        int position = myStack.search(10);
        System.out.println("Position of 10: " + position );
    }
}

// Queue

class MyQueue{
    Queue<Integer> queue;

    MyQueue(Queue<Integer> queue){
        this.queue = queue;
    }

    void callQueueMethods(){

        // Adding elements to the queue
        queue.offer(10);                // {10}
        queue.offer(20);                // {10, 20}
        queue.add(30);                     // {10, 20, 30}
        System.out.println(queue);         // front -> [10, 20, 30] -> back

        // Accessing front and back elements
        System.out.println("Front element: " + queue.peek());       //10

        // NOTE: In queue, back element access is not directly supported

        // Removing the front elements
        queue.poll();
        System.out.println("After polling, front element: " + queue.peek()); // 20

        // Queue size and empty check
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Is the queue is empty: " + queue.isEmpty());
    }
}

// Priority Queue
// Max Heap or Max Priority Queue
class MaxHeap{
    PriorityQueue<Integer> maxHeap1;
    PriorityQueue<Integer> maxHeap2;

    MaxHeap(PriorityQueue<Integer> maxHeap1, PriorityQueue<Integer> maxHeap2){
        this.maxHeap1 = maxHeap1;
        this.maxHeap2 = maxHeap2;
    }

    void callMaxHeap(){

        // Push elements into the max heap priority queue
        maxHeap1.add(30);                   // maxHeap1 = {30}
        maxHeap1.add(10);                   // maxHeap1 = {30, 10}
        maxHeap1.add(50);                   // maxHeap1 = {{50, 30, 10}
        maxHeap1.add(20);                   // maxHeap1 = {50, 30, 20, 10}

        // Print the top element (element with the highest priority) without removing it
        System.out.println("Top element: " + maxHeap1.peek());  // 50

        // Pop the top element
        maxHeap1.poll();

        // Get the size of the max heap priority queue
        System.out.println("Size of the priority queue: " + maxHeap1.size());

        // Check if the priority queue is empty
        if (maxHeap1.isEmpty()){
            System.out.println("The priority queue is empty.");
        }else{
            System.out.println("The priority queue is not empty.");
        }

        // Adding elements to second maxHeap
        maxHeap2.add(60);
        maxHeap2.add(80);
        maxHeap2.add(100);

        // Swap the content of the first max heap priority queue with this second one
        maxHeap2.addAll(maxHeap1);

        System.out.println("After swapping, the first priority queue size: " + maxHeap1.size());
        System.out.println("After swapping, the second priority queue size: " + maxHeap2.size());
        System.out.println(maxHeap2);
    }
}

// Mini Heap or Mini Priority Queue
class MiniHeap{
    PriorityQueue<Integer> miniHeap1;
    PriorityQueue<Integer> miniHeap2;

    MiniHeap(PriorityQueue<Integer> miniHeap1, PriorityQueue<Integer> miniHeap2){
        this.miniHeap1 = miniHeap1;
        this.miniHeap2 = miniHeap2;
    }

    void callMiniHeap(){
        // Push elements into the max heap priority queue
        miniHeap1.add(30);                   // maxHeap1 = {30}
        miniHeap1.add(10);                   // maxHeap1 = {10, 30}
        miniHeap1.add(50);                   // maxHeap1 = {10, 30, 50}
        miniHeap1.add(20);                   // maxHeap1 = {10, 20, 30, 15}

        // Print the top element (element with the highest priority) without removing it
        System.out.println("Top element: " + miniHeap1.peek());  // 10

        // Pop the top element
        miniHeap1.poll();

        // Get the size of the max heap priority queue
        System.out.println("Size of the priority queue: " + miniHeap1.size());

        // Check if the priority queue is empty
        if (miniHeap1.isEmpty()){
            System.out.println("The priority queue is empty.");
        }else{
            System.out.println("The priority queue is not empty.");
        }

        // Adding elements to second maxHeap
        miniHeap2.add(60);
        miniHeap2.add(80);
        miniHeap2.add(100);

        // Swap the content of the first max heap priority queue with this second one
        miniHeap2.addAll(miniHeap1);

        System.out.println("After swapping, the first priority queue size: " + miniHeap1.size());
        System.out.println("After swapping, the second priority queue size: " + miniHeap2.size());
        System.out.println(miniHeap2);
    }
}

class MySet{
    Set<String> linkedHashset;
    Set<String> treeSet;

    MySet(Set<String> linkedHashset, Set<String> treeSet){
        this.linkedHashset = linkedHashset;
        this.treeSet = treeSet;
    }

    void callLinkedHashSet(){

        // Adding Elements
        linkedHashset.add("apple");
        linkedHashset.add("banana");
        linkedHashset.add("cheery");
        linkedHashset.add("banana");      // avoids the duplicate values

        System.out.println("After adding some elements into set: " + linkedHashset);

        // Removing Elements
        linkedHashset.remove("banana");

        System.out.println("After deleting banana element from set: " + linkedHashset);

        // Iteration using Iterator

        Iterator<String> iterator = linkedHashset.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.equals("cherry")){
                iterator.remove();
            }
        }

        // adding multiple elements in one shot

        linkedHashset.addAll(Set.of("orange", "grape","lemon"));

        System.out.println("After adding some elements using addAll method: " + linkedHashset);

        boolean hasApple = linkedHashset.contains("apple");
        boolean hasBanana = linkedHashset.contains(("banana"));

        System.out.println("Contains apple: " + hasApple);
        System.out.println("Contains banana: " + hasBanana);

        //Size
        System.out.println("Size of LinkedHashSet before cleanup: " + linkedHashset.size());

        // Cleanup: clear all elements

        linkedHashset.clear();

        // size
        System.out.println("Size of LinkedHashSet after cleanup: " + linkedHashset.size());

    }

    void callTreeSet(){
        // Adding Elements
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cheery");
        treeSet.add("banana");      // avoids the duplicate values

        System.out.println("After adding some elements into set: " + treeSet);

        // Removing Elements
        linkedHashset.remove("banana");

        System.out.println("After deleting banana element from set: " + treeSet);

        // Iteration using Iterator

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.equals("cherry")){
                iterator.remove();
            }
        }

        // adding multiple elements in one shot

        treeSet.addAll(Set.of("orange", "grape","lemon"));

        System.out.println("After adding some elements using addAll method: " + treeSet);

        boolean hasApple = treeSet.contains("apple");
        boolean hasBanana = treeSet.contains(("banana"));

        System.out.println("Contains apple: " + hasApple);
        System.out.println("Contains banana: " + hasBanana);

        //Size
        System.out.println("Size of TreeSet before cleanup: " + treeSet.size());

        // Cleanup: clear all elements

        treeSet.clear();

        // size
        System.out.println("Size of TreeSet after cleanup: " + treeSet.size());
    }


}

class MyMultiSet{
    Multiset<String> myMultiSet;

    MyMultiSet(Multiset<String> myMultiSet){
        this.myMultiSet = myMultiSet;
    }

    void callMultiSetMethod(){


        // Adding Elements
        myMultiSet.add("banana");
        myMultiSet.add("apple");
        myMultiSet.add("apple");
        myMultiSet.add("banana", 2);
        myMultiSet.add("apple", 3);
        myMultiSet.add("banana", 3);

        System.out.println("After adding Elements: " + myMultiSet.print());

        // Removing elements
        myMultiSet.remove("apple");

        // Checking counts
        myMultiSet.remove("apple");

        // Checking counts
        System.out.println("Count of apples: " + myMultiSet.count("apple"));
        System.out.println("Count of banana: " + myMultiSet.count("banana"));

        // Iterating over multiset
        System.out.println("Elements in the multiset:");
        myMultiSet.elementSet().forEach(element -> System.out.println(element + " x " + myMultiSet.count(element)));

        // Checking if multiSet is empty
        System.out.println("\nIs multiset empty? " + myMultiSet.isEmpty());

        // Total size of the multiset
        System.out.println("Total size of multiset: " + myMultiSet.size());
    }
}

class MyUnorderedSet{
    HashSet<Integer> mySet;

    MyUnorderedSet(HashSet<Integer> mySet){
        this.mySet = mySet;
    }

    void callUnorderedSetMethod(){

        // insert operation
        mySet.add(3);
        mySet.add(4);
        mySet.add(2);
        mySet.add(0);
        mySet.add(3);
        mySet.add(2);
        mySet.add(3);
        // mySet = [0, 2, 3, 4] -> random order and just an example

        System.out.println("After adding elements: " + mySet);

        // Erase operations
        mySet.remove(2);

        System.out.println("After removing 2 from set: " + mySet);

        // Find operation
        if(mySet.contains(3)){
            System.out.println("Found 3");
        }else{
            System.out.println("Not Found");
        }

        // Count operation
        int count = 0;
        for(int element: mySet){
            if(element == 0){
                count++;
            }
        }
        System.out.println("Count of 0: " + count);
    }
}

public class Class3 {
    public static void main(String[] args) {

        MyDeque myDeque= new MyDeque(new ArrayDeque<>());     // creating Deque using MyDeque class
        MyList list = new MyList(new LinkedList<>());         // creating LinkedList using MyList class
        MyStack stack = new MyStack(new Stack<>());           // creating Stack using Stack MyStack class
        MyQueue queue = new MyQueue(new ArrayDeque<>());      // creating Queue using Queue, ArrayDeque and MyQueue class
        MaxHeap maxHeap = new MaxHeap(new PriorityQueue<>(Collections.reverseOrder()), new PriorityQueue<>(Collections.reverseOrder()));        // creating MaxHeap using PriorityQueue and MaxHeap class
        MiniHeap miniHeap = new MiniHeap(new PriorityQueue<>(), new PriorityQueue<>());        // creating MiniHeap using PriorityQueue and MiniHeap class
        MySet set = new MySet(new LinkedHashSet<>(), new TreeSet<String>());   // creating Set using linkedHashSet and treeSet and MySet class
        MyMultiSet multiset = new MyMultiSet(new Multiset<>());                // Creating multiset using custom class package Multiset
        MyUnorderedSet unorderedSet = new MyUnorderedSet(new HashSet<>());     // creating unorderedSet using HashSet

        //calling deque methods
        myDeque.callDequeMethods();

        //calling list methods
        list.callingLinkedListMethods();

        //calling stack methods
        stack.callStackMethods();

        //calling queue methods
        queue.callQueueMethods();

        //calling MaxHeap Priority Queue
        maxHeap.callMaxHeap();

        //calling MiniHeap Priority Queue
        miniHeap.callMiniHeap();

        //calling LinkedHashSet methods from MySet class
        set.callLinkedHashSet();

        //calling TreeSet methods from MySet class
        set.callTreeSet();

        //calling Multiset methods from MyMultiset class
        multiset.callMultiSetMethod();

        //calling UnorderedSet methods from MyUnordered class
        unorderedSet.callUnorderedSetMethod();
    }
}
    
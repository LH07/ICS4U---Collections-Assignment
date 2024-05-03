import java.util.*;

public class CollectionsAssignmentPartOne {
  public static void main(String[] args) {
    // ArrayList

    // This creates the ArrayList
    ArrayList<Integer> list = new ArrayList<Integer>();

    System.out.println("ArrayList: \n");

    // This prints out the ArrayList
    System.out.println("This is the ArrayList: " + list);

    // This adds numbers to the end of the ArrayList
    list.add(2);
    list.add(4);
    list.add(6);
    list.add(8);
    list.add(10);
    System.out.println("This is the ArrayList after additions: " + list);

    // This removes the first value (2) from the ArrayList
    list.remove(0);
    System.out.println("Now we removed value at index 0: " + list);

    // This gets the value at index 2 (Third Item)
    System.out.println("Now we get the value at index 2: " + list.get(2));

    // This sets the value at index 1 (Second Item) to 5
    list.set(1, 5);
    System.out.println("This sets the value at index 1 to 5: " + list);

    // This clears the ArrayList
    list.clear();
    System.out.println("This clears the ArrayList: " + list);

    System.out.println("---------------------------------");

    System.out.println("LinkedList: \n");

    // This creates the LinkedList
    LinkedList<String> list2 = new LinkedList<String>();

    // This prints out the LinkedList
    System.out.println("This is the LinkedList: " + list2);

    // This adds values to the end of the LinkedList
    list2.addLast("Yahya");
    list2.addLast("Josh");
    list2.addLast("Ahmed");
    System.out.println("This is the LinkedList after additions to the end: " + list2);

    // This adds values to the beginning of the LinkedList
    list2.addFirst("James");
    list2.addFirst("Evan");
    System.out.println("This is the LinkedList after additions to the beginning: " + list2);

    // This removes the first value (Evan) from the LinkedList
    list2.removeFirst();
    System.out.println("This is the LinkedList after removing the first value: " + list2);

    // This removes the last value (Ahmed) from the LinkedList
    list2.removeLast();
    System.out.println("This is the LinkedList after removing the last value: " + list2);

    // This gets the first value in the LinkedList
    System.out.println("This is the first value in the LinkedList: " + list2.getFirst());

    System.out.println("---------------------------------");

    System.out.println("Sets: \n");

    // This creates the Set
    Set<Character> set = new HashSet<Character>();
    System.out.println("This is the Set: " + set);

    // This adds values to the Set
    set.add('A');
    set.add('B');
    set.add('C');
    set.add('D');
    System.out.println("This is the Set after additions: " + set);

    // This Checks whether an element is in a Set
    System.out.println("Does the set contain 'B'?: " + set.contains('B'));
    System.out.println("Does the set contain 'E'?: " + set.contains('E'));

    // This checks if the set is empty
    System.out.println("Is the set empty?: " + set.isEmpty());

    // This checks the size of the set
    System.out.println("This is the size of the set: " + set.size());

    System.out.println("---------------------------------");

    System.out.println("Queues: \n");

    // This creates the Queue
    Queue<Double> q = new LinkedList<Double>();

    System.out.println("This is the Queue: " + q);

    // This adds values to the Queue
    q.add(1.0);
    q.add(2.0);
    q.add(3.0);
    q.add(4.0);
    q.add(5.0);
    System.out.println("This is the Queue after additions: " + q);

    // This shows the value at the front of the Queue and removes it
    System.out.println("This is the value at the front of the Queue (Removed After): " + q.poll());

    // This shows the value at the front of the Queue without removing it
    System.out.println("This is the value at the front of the Queue (Not Removed After): " + q.peek());

    // This adds a value to the end of the Queue
    q.offer(6.0);
    System.out.println("This adds a double to the end of the Queue: " + q);

    System.out.println("---------------------------------");

    System.out.println("Maps: \n");

    // This creates the Map
    Map<String, Integer> map = new HashMap<String, Integer>();
    System.out.println("This is the Map: " + map);

    // This places elements inside the Map
    map.put("Red", 1);
    map.put("Blue", 2);
    map.put("Green", 3);
    System.out.println("This is the Map after additions: " + map);

    // This returns the values of all items in the Map
    System.out.println("This is the values of all items in the Map: " + map.values());

    // This creates a hashcode for the Map
    System.out.println("Here is the hashcode for the map: " + map.hashCode());

    // This returns the size of the Map
    System.out.println("This is the size of the Map: " + map.size());

    // This returns a Set view of the HashMap
    System.out.println("This is a Set view of the Map: " + map.entrySet());
  }
}
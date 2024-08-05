import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Gold Coast");
        placesToVisit.add("Tasmania");
//        Overloading the method to add the element at index 0
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        gettingElements(placesToVisit);
        printItinerary(placesToVisit);
        printItinerary1(placesToVisit);
        printItinerary2(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list){
//        these methods are only on LinkedList and not on ArrayList
        list.addFirst("Darwin");
        list.addLast("Hobart");
//        Queue method
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Perth");
//        Stack methods
        list.push("Alice Springs");// placed at the beginning of the list
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
//        remove first element using a no argument .remove method
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        //        remove first element using a no argument .removeFirst() method
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        //        remove last element using a no argument .removeLast() method
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

//        Queue/Deque poll methods
//        removes first element using poll() method
        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        //        removes first element using pollFirst() method
        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        //        removes last element using pollLast() method
        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

//        using push method to add the elements to the top of the
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

//        remove the first element using the pop() method
        String p4 = list.pop();
        System.out.println(p4 + " was removed");


    }

    private static void gettingElements(LinkedList<String> list){
//        retrive element using list.get() method
        System.out.println("Retrived element = " + list.get(4));

//        retrive first element using list.getFirst()
        System.out.println("First element = " + list.getFirst());

        //        retrive last element using list.getLast()
        System.out.println("Last element = " + list.getLast());
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

//        Queue retrieval will print the first element in and first element out (FIFO)
        System.out.println("Element from element() = " + list.element());

//        Stack retrieval methods will print the first element in and first element out (FIFO)
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());

        //        Stack retrieval methods will print the last element
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    private static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at : " + list.getFirst());
        for (int i = 1; i < list.size() ; i++) {

            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));

        }
        System.out.println("Trip ends at : " + list.getLast());
    }

    private static void printItinerary1(LinkedList<String> list){
        System.out.println("Trip starts at : " + list.getFirst());
//        for (int i = 1; i < list.size() ; i++) {
//
//            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
//
//        }
        String previousTown = list.getFirst();
//        Traverse through all the elements
        for (String town:list){
            System.out.println("--> From" + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at : " + list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at : " + list.getFirst());
        String previousTown = list.getFirst();
        //        define a listIterator and use method overloading
        ListIterator<String> iterator = list.listIterator(1);
////        Traverse through all the elements
//        for (String town:list){
//            System.out.println("--> From" + previousTown + " to " + town);
//            previousTown = town;
//        }
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From" + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at : " + list.getLast());
    }
    }



import java.util.LinkedList;

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

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

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
    }



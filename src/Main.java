import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
//        Overloading the method to add the element at index 0
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
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
        list.push("Alice Springs");
    }
}

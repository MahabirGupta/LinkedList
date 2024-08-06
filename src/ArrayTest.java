import java.util.*;

public class ArrayTest {

    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        st.add("X");
        st.add("Y");
        st.add("Z");
        st.add("A");
        st.add("B");
        st.add("C");
        st.add("D");
        st.add("E");
        System.out.println(st);

//        Cannot use sort in ArrayList. Use Collections.sort(st)
        Collections.sort(st);
        System.out.println(st);

//        to print the ArrayList in the reverse order
        Collections.sort(st,Collections.reverseOrder());
        System.out.println(st);

//        Shuffling - Collections.shuffle()
        Collections.shuffle(st);
        System.out.println(st);
        System.out.println();

        LinkedList list = new LinkedList<>();
        list.add("Singapore");
        list.add(5);
        list.add('C');
        list.add(true);
        list.add(null);
        System.out.println(list);
//        changing the value of an element
        list.set(4,"Java");
        System.out.println(list);

//        checking to see if an element is present in the linkedList
        list.contains("Singapore");
        System.out.println(list.contains("Singapore"));
        System.out.println(list.contains("Python"));

//        checking to see if the LinkedList is empty
        list.isEmpty();
        System.out.println(list.isEmpty());

        System.out.println();

//        getting all the elments from the LinkedList using For Loop
        for (int i = 0; i <list.size() ; i++) {

            System.out.print(list.get(i) + " ");

        }
        System.out.println();
        //        getting all the elments from the LinkedList using ForEach Loop
        for (Object i:list){

            System.out.print(i + " ");

        }
        System.out.println();
        //        getting all the elments from the LinkedList using iterator method
        Iterator iterator = list.iterator(); //Declare the Iterator class and create the object of the Iterator class
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        LinkedList<String> str = new LinkedList<>();
        str.add("X");
        str.add("Y");
        str.add("Z");
        str.add("A");
        str.add("B");
        str.add("C");
        System.out.println(str);
//    adding a group of LinkedList to another LinkList
        LinkedList<String> strings = new LinkedList<>(str);
        System.out.println(strings);
//        or
        LinkedList<String> strings1 = new LinkedList<>();
        strings1.addAll(str);
        System.out.println(strings1);

//        remove all the elements from the strings1 LinkedList
        strings1.removeAll(str);
        System.out.println(strings1);
        System.out.println(str);

//        sort the elements in the LinkedList using Collections.sort(collection)
        Collections.sort(str);
        System.out.println(str);

//        sort the elements in the LinkedList in the reverse order
        Collections.sort(str,Collections.reverseOrder());
        System.out.println(str);

// shuffle the elements
        Collections.shuffle(str);
        System.out.println(str);
    }
}

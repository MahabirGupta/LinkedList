import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    }
}

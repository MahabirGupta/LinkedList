import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

    public static void main(String[] args) {
        String[] animals = {"Dog","Cat","Elephant"};
        System.out.println(animals);

        for (String value:animals){
            System.out.println(value);
        }
//        convert String array to ArrayList
        ArrayList<String> animal=new ArrayList<>(List.of(animals));
        System.out.println(animal);
//        or
        ArrayList<String> animal1=new ArrayList<>(Arrays.asList(animals));
        System.out.println(animal1);
    }
}

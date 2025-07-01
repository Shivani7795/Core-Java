import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Create a TreeSet of country names and print them in ascending order.

        TreeSet<String> country = new TreeSet<>();
        country.add("India");
        country.add("Korea");
        country.add("Arabia");
        country.add("China");
        System.out.println("Countries in Ascending Order:");
        for (String c : country) {
            System.out.println(c);
        }
        //13. Create a TreeSet and add integers in random order.
        // Print them to show sorted order.
        TreeSet<Integer> randomsort = new TreeSet<>();
        randomsort.add(384);
        randomsort.add(734);
        randomsort.add(247);
        randomsort.add(754);
        randomsort.add(536);
        System.out.println("sorted order is:" + randomsort);


    }
}

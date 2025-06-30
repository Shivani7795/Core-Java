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
    }
}

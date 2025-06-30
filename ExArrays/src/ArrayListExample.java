import javafx.print.Collation;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("Elements in the ArrayList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Chennai");
        System.out.println("List of Cities (using Iterator):");
        Iterator<String> city = cities.iterator();
        while (city.hasNext()) {
            String cityList = city.next();
            System.out.println(cityList);
        }
        ArrayList<Integer> num = new ArrayList<>();
        num.add(20);
        num.add(40);
        num.add(60);
        num.add(80);
        num.add(100);
        System.out.println("Original List: " + num);
        Iterator<Integer> number = num.iterator();
        while (number.hasNext()) {
            int numb = number.next();
            if (numb > 50) {
                number.remove();
            }
        }

        System.out.println("List after removing elements > 50: " + num);

        ArrayList<String> str = new ArrayList<>();
        str.add("class");
        str.add("java");
        str.add("Jdbc");
        str.add("set");
        if (str.contains("java")) {
            System.out.println("java is present in the string");
        } else {
            System.out.println("java is not present in the string");

        }
        //Create an ArrayList and sort it alphabetically.
        ArrayList<String> alpha = new ArrayList<>();
        alpha.add("banana");
        alpha.add("grapes");
        alpha.add("mango");
        alpha.add("apple");
        Collections.sort(alpha);
        for(int i=0;i<alpha.size();i++) {
            System.out.println("alphabetic order:" + alpha.get(i));
        }

        // Create an ArrayList. Insert 99 at index 2.
        ArrayList<Integer> ins = new ArrayList<>();
        ins.add(10);
        ins.add(30);
        ins.add(60);
        ins.add(80);
        ins.add(00);
        ins.add(2, 99);
        System.out.println("ArrayList after inserting 99 at index 2:");
        for (Integer ind : ins) {
            System.out.println(ind);
        }
    }
}

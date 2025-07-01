import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Soap {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(36);
        collection.add(45);
        collection.add(54);
        collection.add(68);

        Iterator<Integer> iterator= collection.iterator();
        while (iterator.hasNext()){
            Integer n= iterator.next();
            System.out.println(n);
        }

    }
}

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("Apple");
        fruits.add("watermelon");
        fruits.add("grapes");
        System.out.println("List of fruits:" + fruits);

        //Create a LinkedHashSet and add numbers 5, 10, 15, 10, 20. Print the set
        // and observe the order

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);
        System.out.println("numbers in LinkedHashSet:" + numbers);

        //Given a HashSet, check if the set is empty.
        HashSet<String> eptStr = new HashSet<>();
        if(eptStr.isEmpty()){
            System.out.println("the given Hashset is empty");
        }else {
            System.out.println("the given Hashset is not empty");
        }
        //12. Create a HashSet. Add numbers 2, 4, 6, 8. Remove the number 6.
        HashSet<Integer> addNum=new HashSet<>();
        addNum.add(2);
        addNum.add(4);
        addNum.add(6);
        addNum.add(8);
        System.out.println("the numbers before removing 6:"+addNum);
        addNum.remove(6);
        System.out.println("the numbers after removing 6 :" + addNum);


    }
}

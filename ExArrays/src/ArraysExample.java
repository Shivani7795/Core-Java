import java.util.*;
import java.util.stream.IntStream;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        int[] num={6,3,2,9,4};

        Arrays.sort(numbers);
        Arrays.sort(num);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted num: " + Arrays.toString(num));
        System.out.println("-----------------------");

        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
        int[] copyOfNum = Arrays.copyOf(num, num.length);
        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("Copied numbers: " + Arrays.toString(copyOfNumbers));
        System.out.println("Original num: " + Arrays.toString(num));
        System.out.println("Copied num: " + Arrays.toString(copyOfNum));
        System.out.println("-----------------------");

        Arrays.fill(numbers, 1);
        System.out.println("Filled array: " + Arrays.toString(numbers));
        System.out.println("-----------------------");

        boolean equal = Arrays.equals(numbers, num);
        System.out.println("compare 2 arrays -returns boolean)" + equal);
        System.out.println("-----------------------");


        int[] clonedArray = numbers.clone();
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Cloned array: " + Arrays.toString(clonedArray));
        System.out.println("-----------------------");

        int length = numbers.length;
        System.out.println("Length of array: " + length);
        System.out.println("-----------------------");

        int key = 3;
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("-----------------------");


        if (index >= 0) {
            System.out.println("Found " + key + " at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }
        System.out.println("-----------------------");

        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Copied range (1 to 4): " + Arrays.toString(rangeCopy));
        System.out.println("-----------------------");

        Arrays.parallelSort(numbers);
        System.out.println("Parallel sorted array: " + Arrays.toString(numbers));
        System.out.println("-----------------------");

        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of elements: " + sum);
        System.out.println("-----------------------");

        OptionalDouble average = Arrays.stream(numbers).average();

        if (average.isPresent()) {
            System.out.println("Average value: " + average.getAsDouble());
        } else {
            System.out.println("Array is empty, no average.");
        }
        System.out.println("-----------------------");


        OptionalInt max = Arrays.stream(numbers).max();

        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.getAsInt());
        } else {
            System.out.println("Array is empty, no maximum.");
        }
        System.out.println("-----------------------");

        Arrays.parallelSort(numbers);
        System.out.println("Parallel sorted array: " + Arrays.toString(numbers));
        System.out.println("-----------------------");

        int hash = Arrays.hashCode(numbers);
        System.out.println("Hash code of array: " + hash);
        System.out.println("-----------------------");

        int deepHashNumbers = Arrays.deepHashCode(new Object[]{numbers});
        System.out.println("Deep hash code numbers: " + deepHashNumbers);
        System.out.println("-----------------------");

        System.out.println("collections.....");
        List<Integer> numbersList = new ArrayList<>();
        for (int n : numbers) {
            numbersList.add(n);
        }

        List<Integer> numList = new ArrayList<>();
        for (int n : num) {
            numList.add(n);
        }

        Collections.sort(numbersList);
        System.out.println("Sorted numbersList: " + numbersList);

        Collections.reverse(numList);
        System.out.println("Reversed numList: " + numList);

        int maxInNumbers = Collections.max(numbersList);
        System.out.println("Max in numbersList: " + maxInNumbers);

        int minInNum = Collections.min(numList);
        System.out.println("Min in numList: " + minInNum);

        Collections.shuffle(numbersList);
        System.out.println("Shuffled numbersList: " + numbersList);

        numbersList.add(100);
        System.out.println("After adding 100: " + numbersList);

        numList.add(2, 50);
        System.out.println("After adding 50 at index 2: " + numList);

        numbersList.remove(Integer.valueOf(2));//changing value
        System.out.println("After removing element '2': " + numbersList);

        numbersList.set(0, 999);//replacing
        System.out.println("After setting index 0 to 999: " + numbersList);

        int elementAt1 = numList.get(1);
        System.out.println("Element at index 1 in numList: " + elementAt1);

        boolean contains3 = numbersList.contains(3);
        System.out.println("numbersList contains 3? " + contains3);

        int index8 = numbersList.indexOf(8);
        System.out.println("Index of element 8: " + index8);

        int sizeNumList = numList.size();
        System.out.println("Size of numList: " + sizeNumList);

        numbersList.addAll(numList);
        System.out.println("After adding all elements from numList: " + numbersList);

        boolean isEmpty = numbersList.isEmpty();
        System.out.println("Is numbersList empty or not " + isEmpty);

        Integer[] numbersArray = numbersList.toArray(new Integer[0]);
        System.out.println("numbersList as array: " + java.util.Arrays.toString(numbersArray));

        int freq3 = Collections.frequency(numbersList, 3);
        System.out.println("Frequency of 3 in numbersList: " + freq3);



    }
}

package string;//reverse given sentence without using the length()

public class Reverse {
    public static void main(String[] args) {
        String name = "Anusha";
        char[] array = name.toCharArray();
        String reverse = "";
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }
        for (int i = count - 1; i >= 0; i--) {
            reverse += array[i];
        }

        System.out.println("Original: " + name);
        System.out.println("Reversed: " + reverse);
    }
}



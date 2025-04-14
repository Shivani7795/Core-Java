package string;//count the number of characters present in a given sentence

public class CharCount {
    public static void main(String[] args) {
    String sentence="this is java class";
    char[] array = sentence.toCharArray();
    int count = 0;

    for(int i = 0; i < array.length; i++) {
        count++;
    }
    System.out.println("The number of characters in the sentence is: " + count);
    }
}
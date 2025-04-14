package string;// count only the spaces

public class CountSpace {
    public static void main(String[] args) {
        String sentence = "this is java class";
        char[] array = sentence.toCharArray();
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                count++;
            }
        }
        System.out.println("The number of spaces in the sentence is: " + count);
    }
}
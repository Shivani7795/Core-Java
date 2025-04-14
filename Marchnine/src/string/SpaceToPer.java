package string;// replace the space by %

public class SpaceToPer {
    public static void main(String[] args) {
        String sentence = "this is java class";
        char[] array = sentence.toCharArray();
        String percentage = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                percentage += '%';
            } else {
                percentage += array[i];
            }
        }
        System.out.println("Modified sentence: " + percentage);
    }
}
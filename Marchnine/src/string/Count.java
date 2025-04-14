package string;//count the number of words present in a given sentence

public class Count {
    public static void main(String[] args) {
        String sentence="this is java class";
        String[] words = sentence.split("\\s+");
        int totalwords = words.length;
        System.out.println("The number of words in the sentence is: " +totalwords);

    }
}




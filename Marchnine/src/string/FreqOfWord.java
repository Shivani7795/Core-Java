package string;//display the frequency of the each word

public class FreqOfWord {
    public static void main(String[] args) {
        String a = "this is Chair and this is Table";
        String[] words = a.split(" ");
        String[] wordsC = new String[words.length];
        int[] wordCount = new int[words.length];
        int uniqueIndex = 0;

        for (int i = 0; i < words.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueIndex; j++) {
                if (words[i].equals(wordsC[j])) {
                    wordCount[j]++;
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                wordsC[uniqueIndex] = words[i];
                wordCount[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(wordsC[i] + ": " + wordCount[i]);
        }
    }
}
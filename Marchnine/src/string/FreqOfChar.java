package string;//display the frequency of the each character

public class FreqOfChar {
    public static void main(String[] args) {
        String a = "this is Chair and this is Table";
        char[] chars = a.toCharArray();
        char[] charsC = new char[chars.length];
        int[] charCount = new int[chars.length];
        int uniqueIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            boolean isUnique = true;
            for (int j = 0; j < uniqueIndex; j++) {
                if (chars[i] == charsC[j]) {
                    charCount[j]++;
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                charsC[uniqueIndex] = chars[i];
                charCount[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(charsC[i] + ": " + charCount[i]);
        }
    }
}
package casting;

public class Length {

    public static void main(String[] args) {
        String a = "Hello";
        char[] b = a.toCharArray();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

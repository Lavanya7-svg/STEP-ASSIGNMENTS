public class Q2 {
    public static void reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }

    public static void main(String[] args) {
        reverse("hello");
    }
}

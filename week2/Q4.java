public class Q4 {
    public static void sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    public static void main(String[] args) {
        sumDigits(12345);
    }
}

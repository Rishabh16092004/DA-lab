public class ques32 {
    static int sumOfDivisors(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int limit = 1000;
        System.out.println("Amicable pairs between 1 and " + limit + " are:");

        for (int a = 2; a <= limit; a++) {
            int b = sumOfDivisors(a);
            if (b > a && b <= limit) {
                if (sumOfDivisors(b) == a) {
                    System.out.println("(" + a + ", " + b + ")");
                }
            }
        }
    }
}

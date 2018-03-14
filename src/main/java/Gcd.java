public class Gcd {
    // 求最大公约数
    public static int gcd(int number1, int number2) {
        if (number2 == 0) return number1;
        int result = number1 % number2;
        return gcd(number2, result);
    }

    public static void main(String[] args) {
        System.out.println(gcd(16,4));
        System.out.println(gcd(120000,8800));
    }
}

public class ReadInputs {
    public static void main(String[] args) {
        // 打印n个(low,high)的随机数
        int n = Integer.parseInt(args[0]);
        double low = Double.parseDouble(args[1]);
        double high = Double.parseDouble(args[2]);

        for (int i = 0; i < n; i++) {
            double x = StdRandom.uniform(low, high);
            StdOut.printf("%.2f\n", x);
        }
    }
}

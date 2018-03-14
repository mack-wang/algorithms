public class Array {
    // 获取数组最大值
    public static double getMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max) max = array[i];
        return max;
    }

    //计算数组平均值
    public static double getAverage(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum / array.length;
    }

    //复制数组
    public static double[] getCopy(double[] array) {
        double[] copy = new double[array.length];
        for (int i = 0; i < array.length; i++)
            copy[i] = array[i];
        return copy;
    }

    //倒序
    public static double[] getReverse(double[] array) {
        double[] reverse = new double[array.length];
        for (int i = 0; i < array.length; i++)
            reverse[array.length - i - 1] = array[i];
        return reverse;
    }

    //更高效的倒序
    public static double[] getReverse2(double[] array) {
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            double temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - i - 1] = temp;
        }
        return array;
    }


    public static void main(String[] args) {
        double[] array = new double[3];
        array[0] = 1.0;
        array[1] = 1.6;
        array[2] = 1.5;

        System.out.println(getMax(array));
        System.out.println(getAverage(array));
        double[] copy = getCopy(array);
        double[] reverse = getReverse(array);
        double[] reverse2 = getReverse2(array);
    }
}

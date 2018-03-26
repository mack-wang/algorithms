public class ChooseSort {
    // 选择排序
    // 两两依次比较，小的在左边，大的在右边，最终就会生成排序
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    // 插入排序
    public static void insetSort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // 从打印出来a[j],a[j-1]来看
            // 相当于谁大就往右和相邻一项交换，并继续和下一项进行比较，直到大的都到右边。
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    // 希尔排序
    public static void shellSort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;// 1, 4, 13, 40, 121, 364, 1093
        while (h >= 1) {
            // 当a数组越大，则h的间隔也会慢慢越变越大，
            // 插入排序相当于h为1的恒定希尔排序。
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static Boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        show(a);
//        sort(a);
//        insetSort(a);
        shellSort(a);
        System.out.println(isSorted(a));
        show(a);
    }

}
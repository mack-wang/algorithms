public class QuickSort {
    /*
    *
    * 在小数组下，插入排序优于快速排序
    * */

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        ///if(hi <= lo + 10) { 切换成插入排序，并返回空}// 小数组切换成插入排序 5~10算比较小的数组
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    // 切分
    // 以第一个值作为切分值，然后向左找比他大的，从最后一个值向右找比他小的，找到后，二者交换，然后继续向左向右，继续交换
    // 直到向左向右相遇后，寻找和交换结束，相遇的序号j和第一个值进行交换。因为前面的不停交换使得切分值左侧的都比切分值小，右侧
    // 的都比切分值大，
    // 接下来我们就对左侧和右侧两段分别排序，排序好，并在一起就是一个完整的排序了！

    // 优化：可以取三个数字，取三个数字的居中数来作为切分值
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        show(a);
    }
}

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
            // 当a数组越大，则h的间隔也会越大，
            // h会慢慢变小
            // 希尔排序先把数组分割成多个h长度的小数组，进行分组排序，然后再逐渐缩小h的值，直到为1时进行经典的插入排序
            // 但因为前期已经进行过分组排序，提高了最后的插入排序的恨不能。
            // 插入排序相当于h为1的恒定希尔排序。
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    private static Comparable[] aux;

    // 原地归并
    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi ; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi ; k++) {
            if(i>mid){
                a[k] = aux[j++];
            }else if(j>hi){
                a[k] = aux[i++];
            }else if(less(aux[j], aux[i])){
                a[k] = aux[j++];
            }else{
                a[k] = aux[i++];
            }
        }
    }

    // 自顶向下的归并排序
    public static void mergeSort(Comparable[] a){
        aux = new Comparable[a.length];
        mergeSort(a, 0, a.length-1);
    }

    public static void mergeSort(Comparable[] a, int lo, int hi){
        if(hi <= lo) return;
        int mid = lo + (hi-lo)/2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid+1, hi);
        merge(a, lo, mid, hi);
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
//        shellSort(a);
        mergeSort(a);
        System.out.println(isSorted(a));
        show(a);
    }

}

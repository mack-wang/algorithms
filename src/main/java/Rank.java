public class Rank {
    // 二分查找
    // 要先确保数组是单调递增或单调递减的才适合使用
    public static int rank(int key, int[] array) {
        return rank(key, array, 0, array.length - 1);
    }

    public static int rank(int key, int[] array, int low, int high) {
        if (low > high) return -1;
        int middle = low + (high - low) / 2;
        if (key < array[middle]) return rank(key, array, low, middle - 1);
        else if (key > array[middle]) return rank(key, array, middle + 1, high);
        else return middle;
    }

    public static void main(String[] args) {
        int[] array = new int[53];
        for(int i=3;i<53;i++){
            array[i-3] = i*8;
        }
        PrintUtil.printArray(array);
        System.out.println(array[8]);
        System.out.println(rank(64, array));
    }
}

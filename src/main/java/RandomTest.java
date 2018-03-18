public class RandomTest {
    public static void main(String[] args) {
        // 0-100之间的随机数
        System.out.println(StdRandom.uniform(100));
        // 50-100之间的随机数
        System.out.println(StdRandom.uniform(50,100));
        // 50 - 100之间的实数
        System.out.println(StdRandom.uniform(50.0,100.0));
        int[] array = new int[100];
        for(int i = 0; i < 100; i++)
            array[i] = i;
        // 把数组打乱
        StdRandom.shuffle(array);
        PrintUtil.printArray(array);
    }
}

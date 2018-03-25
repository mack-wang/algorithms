public class PrintUtil {
    public static void printArray(int[] array) {
        String arrayString = "";
        for (int i = 0; i < array.length; i++)
            arrayString += "," + array[i];
        System.out.println("[" + arrayString.substring(1) + "]");
    }

    public static void printArray(String[] array) {
        String arrayString = "";
        for (int i = 0; i < array.length; i++)
            arrayString += "," + array[i];
        System.out.println("[" + arrayString.substring(1) + "]");
    }
}

public class BooleanArray {
    public static void main(String[] args) {
        Boolean[][] array = new Boolean[10][100];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 100; j++){
                array[i][j] = StdRandom.uniform(2) == 1;
            }
        }
        for (int i = 0; i < 10; i++){
            System.out.print(i);
            System.out.print(" ");
            for (int j = 0; j < 100; j++){
                if(array[i][j]){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

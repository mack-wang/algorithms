public class ChangeRowColumn {
    public static void main(String[] args) {
        int row = 10;
        int column = 5;
        int[][] array = new int[row][column];
        int a = 0;
        for(int i = 0 ;i<row;i++){
            for(int j = 0;j<column;j++){
                array[i][j] = a++;
            }
        }
        for(int i = 0 ;i<row;i++){
            for(int j = 0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------行和列反转后--------");
        int newrow = array[0].length;
        int newcolumn = array.length;
        int[][] result = new int[newrow][newcolumn];
        for(int i = 0 ;i<newrow;i++){
            for(int j = 0;j<newcolumn;j++){
                result[i][j] = array[j][i];
            }
        }
        for(int i = 0 ;i<newrow;i++){
            for(int j = 0;j<newcolumn;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}

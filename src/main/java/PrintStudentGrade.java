public class PrintStudentGrade {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            // 要求 名字 分数一 分数二 平均分
            // 输出 ------------
            //      | name | 数学 100分 | 语言 100分 | 平均分 100.0分 |
            String[] input = StdIn.readAllStrings();
            System.out.print("|");
            System.out.printf("%16s", "姓名："+input[0]);
            System.out.print("|");
            System.out.printf("%10s", "数学："+ input[1]+"分");
            System.out.print("|");
            System.out.printf("%10s", "语文："+ input[2]+"分");
            System.out.print("|");
            System.out.printf("%12s", "平均分："+(Double.parseDouble(input[1])+Double.parseDouble(input[2]))/2+"分");
            System.out.print("|");
        }
    }
}

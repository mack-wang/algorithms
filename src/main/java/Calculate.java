import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Calculate {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<Invoice>();
        while (!StdIn.isEmpty()){
            // 获取输入
            // 0编号、1名称、2规格、3单位、4数量、5单价
            String[] input = StdIn.readAllStrings();
            Integer len = input.length/6;
            for(int i = 0; i<len;i++){
                // 创建发票Invoice对象
                BigDecimal price = new BigDecimal(input[6*i+5]);
                Invoice invoice = new Invoice(
                        Integer.valueOf(input[6*i+0]),
                        input[6*i+1],
                        input[6*i+2],
                        input[6*i+3],
                        Integer.valueOf(input[6*i+4]),
                        price,
                        price.multiply(new BigDecimal(input[6*i+4]))
                );
                invoices.add(invoice);
            }

        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.print("|");
        System.out.printf("%8s", "编号");
        System.out.print("|");
        System.out.printf("%18s", "名称");
        System.out.print("|");
        System.out.printf("%8s", "规格");
        System.out.print("|");
        System.out.printf("%8s", "单位");
        System.out.print("|");
        System.out.printf("%8s", "数量");
        System.out.print("|");
        System.out.printf("%8s", "单价");
        System.out.print("|");
        System.out.printf("%8s", "金额");
        System.out.println("|");
        BigDecimal total = new BigDecimal(0);
        for(Invoice invoice : invoices){
            System.out.print("|");
            System.out.printf("%10s", invoice.getId());
            System.out.print("|");
            System.out.printf("%20s", invoice.getName());
            System.out.print("|");
            System.out.printf("%10s", invoice.getType());
            System.out.print("|");
            System.out.printf("%10s", invoice.getUnit());
            System.out.print("|");
            System.out.printf("%10s", invoice.getNumber());
            System.out.print("|");
            System.out.printf("%10s", invoice.getPrice().setScale(2).toString());
            System.out.print("|");
            System.out.printf("%10s", invoice.getSum().setScale(2).toString());
            System.out.println("|");
            total = total.add(invoice.getSum());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("合计:"+total.setScale(2).toString());
    }
}

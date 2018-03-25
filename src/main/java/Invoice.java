import java.math.BigDecimal;

public class Invoice {
    public Integer id;
    public String name;
    public String type;
    public String unit;
    public Integer number;
    public BigDecimal price;
    public BigDecimal sum;

    public Invoice(Integer id, String name, String type, String unit, Integer number, BigDecimal price, BigDecimal sum) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.unit = unit;
        this.number = number;
        this.price = price;
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}

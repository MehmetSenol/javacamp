package odev4_2.Entities;

public class Campaign {
    private int discount;
    private String name;



    public Campaign(int discount, String name) {
        this.discount = discount;
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

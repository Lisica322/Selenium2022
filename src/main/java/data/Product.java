package data;

public class Product {
    private String name;
    private double price;
    private final boolean warranty;
    private int warrantyPrice;
    private int quantity = 1;
    private int indexInArray;

    public Product(String name, boolean warranty, int warrantyPrice, int indexInArray) {
        this.name = name;
        this.warranty = warranty;

        this.warrantyPrice = warrantyPrice;
        this.indexInArray = indexInArray;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public int getWarrantyPrice() {
        return warrantyPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getIndexInArray() {
        return indexInArray;
    }
}

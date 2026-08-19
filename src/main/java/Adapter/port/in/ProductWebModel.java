package Adapter.port.in;

public class ProductWebModel {

    private String name;
    private double price;
    private CategoryWebModel category;

    public ProductWebModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryWebModel getCategory() {
        return category;
    }

    public void setCategory(CategoryWebModel category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductWebModel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
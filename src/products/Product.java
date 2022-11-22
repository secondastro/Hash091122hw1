package products;

import java.util.Objects;

public class Product {
    private final String name;
    private final double price;
    private final double weight;

    private boolean checked;

    public Product(String name, double price, double weight) {
        if (name == null || name.isBlank() || name.isEmpty() || price <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара");
        }
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.checked = false;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked()?"Да":"Нет";

        return String.format("%s, цена: %s, вес: %s, куплен: %s", this.name, this.price, this.weight, checkedString);
    }
}

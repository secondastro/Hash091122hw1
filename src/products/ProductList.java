package products;

import java.util.*;

public class ProductList {

    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (products.contains(product)) {
            throw new ProductAlreadyExistsException("Товар " + product.getName() + " уже в корзине");
        } else {
            products.add(product);
        }
    }

    public void checkProduct(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals(name)) {
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Список продуктов: " + '\n');
        for (Product product : products) {
            s.append(product).append('\n');
        }
        return s.toString();
    }
}



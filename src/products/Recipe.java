package products;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String name;

    private final Map<Product, Integer> products = new HashMap<>();


    public Recipe(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void addProduct(Product product) {
        if (this.products.containsKey(product)) {
            this.products.put((product), this.products.get(product) + 1);
        } else {
            this.products.put(product, 1);
        }
    }
    public void addProduct(Product product, int quantity) {
        if (this.products.containsKey(product)) {
            this.products.put((product), this.products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }
    }

    public Set<Map.Entry<Product, Integer>> getEntries() {
       return products.entrySet();
    }

    public double getRecipePrice() {
        double sum = 0;
        for (Map.Entry<Product,Integer> product : this.products.entrySet()){
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Рецепт ").append(name).append(". Ингриденты: ").append('\n');
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            s.append(entry.getKey().getName()).append(", ").append(entry.getValue()).append(" шт.").append('\n');
        }
        return s.toString();

    }
}


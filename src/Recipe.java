import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String name;
    private Set<Product> products;


    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isEmpty() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getRecipePrice() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
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
        s.append("Рецепт " + name + ". Ингриденты: " + '\n');
        for (Product product : products) {
            s.append(product.getName()).append('\n');
        }
        return s.toString();

    }
}


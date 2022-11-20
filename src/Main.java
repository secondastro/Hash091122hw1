import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ProductList productList = new ProductList();

        Product tea = new Product("Чай", 176.50, 0.5);
        productList.addProduct(tea);
        Product sausage = new Product("Колбаса", 250.0, 0.8);
        productList.addProduct(sausage);
        Product pelmeni = new Product("Пельмени", 300, 1);
        productList.addProduct(pelmeni);
        Product cookies = new Product("Печенье", 120, 0.5);
        productList.addProduct(cookies);
        productList.removeProduct("Чай");
        Product vodka = new Product("Водка", 200, 0.5);
        productList.addProduct(vodka);
        Product orangeJuice = new Product("Сок апельсиновый", 150, 1);
        productList.addProduct(orangeJuice);


        RecipeList recipeList = new RecipeList();
        Set<Product> cocktailIngredients  = new HashSet<>();
        cocktailIngredients.add(vodka);
        cocktailIngredients.add(orangeJuice);
        Recipe otvertka=new Recipe("Отвёртка", cocktailIngredients);
        recipeList.addRecipe(otvertka);

        Set<Product> hotDogIngredients = new HashSet<>();
        hotDogIngredients.add(new Product("Булочка", 25, 0.2));
        hotDogIngredients.add(new Product("Сосиска", 80, 0.5));
        Recipe hotDog = new Recipe("Хотдог", hotDogIngredients);
        recipeList.addRecipe(hotDog);

        System.out.println(recipeList);
        System.out.println();
        System.out.println(productList);
        System.out.println("Стоимость продуктов для рецепта " +
                otvertka.getName().toLowerCase() + ": " + otvertka.getRecipePrice());
        }
    }

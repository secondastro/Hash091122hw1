package products;

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

        productList.checkProduct("Печенье");


        RecipeList recipeList = new RecipeList();

        Recipe otvertka = new Recipe("Отвёртка");
        otvertka.addProduct(vodka);
        otvertka.addProduct(orangeJuice,2);
        recipeList.addRecipe(otvertka);


        Recipe hotDog = new Recipe("Хотдог");
        hotDog.addProduct(new Product("сосиска", 80, 0.1), 2);
        hotDog.addProduct(new Product("Булочка", 15, 0.2));
        recipeList.addRecipe(hotDog);

        System.out.println(recipeList);
        System.out.println();
        System.out.println(productList);


    }

}

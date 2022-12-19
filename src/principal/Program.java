package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {

    public static void main(String[] args) {
        
        List<Product> produtos = new ArrayList<>();

        produtos.add(new Product("Tv", 900.0));
        produtos.add(new Product("Mouse", 50.0));
        produtos.add(new Product("Tablet", 350.0));
        produtos.add(new Product("HD Case", 80.0));

        ProductService ps = new ProductService();

        System.out.println(ps.sumPrice(produtos, p -> p.getName().charAt(0) == 'T'));


        


    }

}
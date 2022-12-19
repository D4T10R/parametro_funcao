package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

    public Double sumPrice(List<Product> list, Predicate<Product> condicao) {
        Double sum = 0.0;
        for (Product prod : list) {
            if (condicao.test(prod)) {
                sum += prod.getPrice();
            }
        }
        return sum;
    }


}

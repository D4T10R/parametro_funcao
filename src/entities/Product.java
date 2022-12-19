package entities;

public class Product {

    // ATRIBUTOS
    private String name;
    private Double price;
    // ATRIBUTOS
    
    // CONSTRUTOR
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // CONSTRUTOR

    // ENCAPSULAMENTOS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    // ENCAPSULAMENTOS

    // METODOS
    public String toString() {
        return "Nome: " + name + ", R$" + price;
    }
    // METODOS
    
}

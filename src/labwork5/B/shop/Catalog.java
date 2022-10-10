package labwork5.B.shop;

import java.util.List;

public class Catalog {
    private String name;
    Product[] products;

    public Catalog(String name, Product[] productList) {
        this.name = name;
        this.products = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProductList() {
        return products;
    }

    public void setProductList(Product[] productList) {
        this.products = productList;
    }
}

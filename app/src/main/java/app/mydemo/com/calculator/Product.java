package app.mydemo.com.calculator;

import java.util.ArrayList;

/**
 * Created by Regis on 07-04-2018.
 */

public class Product {
    ArrayList<Product> productAList=new ArrayList<>();
    String productName;
    float productPrice,totalCost;
    int productGst;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public int getProductGst() {
        return productGst;
    }

    public void setProductGst(int productGst) {
        this.productGst = productGst;
    }

    public ArrayList<Product> createProductList() {

        Product product = new Product();
        product.setProductName("Milk");
        product.setProductGst(5);
        product.setProductPrice(20);
        product.setTotalCost(24);
        Product product2 = new Product();
        product2.setProductName("wheat");
        product2.setProductGst(5);
        product2.setProductPrice(50);
        product2.setTotalCost(65);
        Product product3 = new Product();
        product3.setProductName("rice");
        product3.setProductGst(12);
        product3.setProductPrice(50);
        product3.setTotalCost(70);

        productAList.add(product);
        productAList.add(product2);
        productAList.add(product3);
        return productAList;
    }
}

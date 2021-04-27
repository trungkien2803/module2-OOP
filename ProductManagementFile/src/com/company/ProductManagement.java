package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private static List<Product> list = new ArrayList<>();

    public List<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public void addProduct(Product product){
        list.add(product);
    }
    public void displayProductList(){
        for (Product product : list){
            System.out.println(product);
        }
    }
    public void findProduct(String id){
        for (Product product : list){
            if (id.equals(product.getProductId())){
                System.out.println(product);
                break;
            }
        }
    }

}

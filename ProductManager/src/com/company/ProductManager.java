package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Comparator<Product> {
    private List<Product> listProducts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public void addProduct(Product product){
        listProducts.add(product);
    }
    public void editProduct(String id){
        for (Product product : listProducts){
            if(id.equals(product.getId())){
                System.out.println("Nhập id mới");
                String newId = sc.next();
                System.out.println("Nhập tên mới");
                String newName = sc.next();
                System.out.println("Nhập giá mới");
                double newPrice = sc.nextDouble();
                product.setId(newId);
                product.setName(newName);
                product.setPrice(newPrice);
            }
        }
    }

    public void deleteProduct(String id){
        for(int i = 0; i < listProducts.size();i++){
            if(id.equals(listProducts.get(i).getId())){
                listProducts.remove(i);
            }
        }
    }

    public void displayProducts(){
        for (Product product : listProducts){
            product.displayProductInfo();
        }
    }
    public void findProduct(String name){
        for(Product product : listProducts){
            if(name.equals(product.getName())){
                product.displayProductInfo();
            }
        }
    }
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }

}

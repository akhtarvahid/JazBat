package com.example.vaheed.tablayout;

/**
 * Created by vaheed on 21/4/16.
 */
public class Product {
    private int id;
    private String name;
  //  private double price;

    public Product(){
        super();
    }

    public Product(int id, String name) {
        super();
        this.id = id;
        this.name = name;
       // this.price = price;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.name ;
    }
}
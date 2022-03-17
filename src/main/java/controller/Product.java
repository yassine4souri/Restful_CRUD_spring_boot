package controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table()
public class Product {

    private int id;
    private String nama;
    private double price;
    private int quantiy;



}

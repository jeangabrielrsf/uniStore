package br.com.unistore.unistore.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Carts")
public class CartModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private List<ProductModel> products;
    private UserModel user;
}

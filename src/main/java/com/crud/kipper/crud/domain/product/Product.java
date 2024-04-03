package com.crud.kipper.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer priceInCents;
    private boolean active;

    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.priceInCents = requestProduct.price_in_cents();
        this.active = true;
    }
}

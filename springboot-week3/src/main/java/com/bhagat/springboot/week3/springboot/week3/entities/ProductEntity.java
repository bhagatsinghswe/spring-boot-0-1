package com.bhagat.springboot.week3.springboot.week3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name="product_table",
        uniqueConstraints = {
                @UniqueConstraint(name="title_price_unique", columnNames = {"title_x", "price"})
        },
        indexes = {
                @Index(name="sku_index", columnList = "sku")
        }
)
public class ProductEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String sku;

    @Column(name = "title_x")
    private String title;

//    @Column(precision = 10, scale = 2)
    private BigDecimal price;
    private Integer quantity;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}

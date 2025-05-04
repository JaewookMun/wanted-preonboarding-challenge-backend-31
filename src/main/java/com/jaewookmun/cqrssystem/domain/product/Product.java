package com.jaewookmun.cqrssystem.domain.product;

import com.jaewookmun.cqrssystem.domain.BaseEntity;
import com.jaewookmun.cqrssystem.domain.classification.Brand;
import com.jaewookmun.cqrssystem.domain.account.Seller;
import com.jaewookmun.cqrssystem.domain.product.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "products")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Product extends BaseEntity {
    @Id @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String slug;
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String fullDescription;
    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;
}

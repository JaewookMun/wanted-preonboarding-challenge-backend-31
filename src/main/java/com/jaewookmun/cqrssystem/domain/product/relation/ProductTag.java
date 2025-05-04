package com.jaewookmun.cqrssystem.domain.product.relation;

import com.jaewookmun.cqrssystem.domain.classification.Tag;
import com.jaewookmun.cqrssystem.domain.product.Product;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "product_tags")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProductTag {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private Tag tag;
}

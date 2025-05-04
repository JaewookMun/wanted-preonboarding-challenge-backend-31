package com.jaewookmun.cqrssystem.domain.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "product_options")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProductOption {
    @Id @GeneratedValue
    private Long id;
    /** 옵션명 (예: "빨강", "XL") */
    @Column(nullable = false)
    private String name;
    @Column(precision = 12, scale = 2)
    private BigDecimal additionalPrice;
    /** 재고 관리 코드 */
    private String sku;
    private int stock;
    private int displayOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_group_id")
    private ProductOptionGroup optionGroup;
}

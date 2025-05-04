package com.jaewookmun.cqrssystem.domain.product;

import com.jaewookmun.cqrssystem.domain.product.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "product_prices")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProductPrice {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal basePrice;
    @Column(precision = 12, scale = 2)
    private BigDecimal salePrice;
    /** 원가 (관리용) */
    @Column(precision = 12, scale = 2)
    private BigDecimal costPrice;
    @Enumerated(EnumType.STRING)
    private CurrencyType currency = CurrencyType.KRW;
    @Column(precision = 5, scale = 2)
    private BigDecimal taxRate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}

package com.jaewookmun.cqrssystem.domain.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "product_images")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProductImage {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String url;
    /** 대체 텍스트 */
    private String altText;
    /** 대표 이미지 여부 */
    private boolean isPrimary;
    private int displayOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_id", nullable = false)
    private ProductOption productOption;
}

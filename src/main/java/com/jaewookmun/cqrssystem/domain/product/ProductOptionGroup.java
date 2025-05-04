package com.jaewookmun.cqrssystem.domain.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "product_option_groups")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProductOptionGroup {
    @Id @GeneratedValue
    private Long id;
    /** 옵션 그룹명 (예: "색상", "사이즈") */
    @Column(nullable = false)
    private String name;
    /** 표시 순서 */
    private int displayOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}

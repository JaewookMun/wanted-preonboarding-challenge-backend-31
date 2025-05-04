package com.jaewookmun.cqrssystem.domain.product;

import com.jaewookmun.cqrssystem.domain.product.dto.Dimension;
import com.jaewookmun.cqrssystem.domain.product.enums.CountryOrigin;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.util.Map;

@Table(name = "product_details")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProductDetail {
    @Id @GeneratedValue
    private Long id;
    /** gram(g) 기준 */
    @Column(precision = 10, scale = 2)
    private BigDecimal weight;
    /** 제품 크기 */
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")
    private Dimension dimensions;
    /** 소재 정보 */
    private String materials;
    /** 원산지 */
    @Enumerated(EnumType.STRING)
    private CountryOrigin countryOfOrigin;
    /** 보증 정보 */
    private String warrantyInfo;
    /** 관리 지침 */
    private String careInstructions;
    /** 부가 정보 */
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> additionalInfo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}

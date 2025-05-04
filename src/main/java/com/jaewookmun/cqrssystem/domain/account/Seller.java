package com.jaewookmun.cqrssystem.domain.account;

import com.jaewookmun.cqrssystem.domain.BaseCreatedAtEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "sellers")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Seller extends BaseCreatedAtEntity {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    private String logoUrl;
    @Column(precision = 3, scale = 2)
    private BigDecimal rating;
    private String contactEmail;
    private String contactPhone;
}

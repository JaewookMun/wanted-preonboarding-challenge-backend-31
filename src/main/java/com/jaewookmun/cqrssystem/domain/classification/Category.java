package com.jaewookmun.cqrssystem.domain.classification;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "categories")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Category {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    /** URL 슬러그 */
    @Column(nullable = false, unique = true)
    private String slug;
    private String description;
    /** 카테고리 레벨 (1: 대분류, 2: 중분류, 3: 소분류) */
    private int level;
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> children = new ArrayList<>();

}

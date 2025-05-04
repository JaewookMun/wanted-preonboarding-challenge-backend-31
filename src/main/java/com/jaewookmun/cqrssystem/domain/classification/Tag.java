package com.jaewookmun.cqrssystem.domain.classification;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tags")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Tag {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    /** URL 슬러그 */
     @Column(unique = true, nullable = false)
    private String slug;
}

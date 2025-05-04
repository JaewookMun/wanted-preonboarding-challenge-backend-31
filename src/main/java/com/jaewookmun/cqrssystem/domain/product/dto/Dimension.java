package com.jaewookmun.cqrssystem.domain.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Dimension {
    private Double length;
    private Double width;
    private Double height;
}

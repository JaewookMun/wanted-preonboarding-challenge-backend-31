package com.jaewookmun.cqrssystem.domain.product;

import com.jaewookmun.cqrssystem.domain.BaseEntity;
import com.jaewookmun.cqrssystem.domain.account.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "reviews")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Review extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    /** 평점 (1-5) */
    @Min(1) @Max(5)
    private int rating;
    private String title;
    private String content;
    /** 구매 확인 여부 */
    private boolean verifiedPurchase;
    /** 도움됨 투표 수 */
    private int helpfulVotes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}

package com.jaewookmun.cqrssystem.domain.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CountryOrigin {
    KOREA("대한민국"),
    CHINA("중국"),
    JAPAN("일본"),
    USA("미국"),
    GERMANY("독일"),
    FRANCE("프랑스"),
    ITALY("이탈리아"),
    UK("영국"),
    CANADA("캐나다"),
    AUSTRALIA("호주"),
    VIETNAM("베트남"),
    THAILAND("태국"),
    TAIWAN("대만"),
    INDIA("인도"),
    SPAIN("스페인"),
    BRAZIL("브라질"),
    MEXICO("멕시코"),
    SWITZERLAND("스위스"),
    SWEDEN("스웨덴"),
    MALAYSIA("말레이시아"),
    INDONESIA("인도네시아"),
    BANGLADESH("방글라데시"),
    TURKEY("터키"),
    NETHERLANDS("네덜란드"),
    BELGIUM("벨기에"),
    OTHER("기타");

    private final String displayName;
}

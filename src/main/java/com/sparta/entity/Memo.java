package com.sparta.entity;

import jakarta.persistence.*;

@Entity //JPA 가 관리할 수 있는 Entity 클래스 지정 //Entity 는 setter 조심할 것
@Table(name = "memo") // 매핑할 테이블의 이름을 지정
public class Memo {

    @Id //기본키 //영속성 컨텍스트가 Entity 를 구별할 때 사용 즉, 식별자
    //@GeneratedValue(strategy = GenerationType.IDENTITY) //test 할 때는 직접 값을 넣어주기 때문에 없애줘야 함
    private Long id;

    //nullable: null 허용 여부
    //unique: 중복 허용 여부 (false 일때 중복 허용)
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    //length: 컬럼 길이 지정
    @Column(name = "contents", nullable = false, length = 500)
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
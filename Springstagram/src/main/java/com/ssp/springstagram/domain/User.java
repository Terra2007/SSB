package com.ssp.springstagram.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String accountId;

    @Column(columnDefinition = "CHAR(60)", nullable = false)
    private String password;

    @Column(columnDefinition = "CHAR(11)", nullable = false)
    private String phoneNumber;
}
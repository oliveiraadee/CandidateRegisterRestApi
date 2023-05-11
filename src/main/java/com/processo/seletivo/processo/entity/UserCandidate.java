package com.processo.seletivo.processo.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCandidate{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telephone;
    private int frontend;
    private int backend;
    private int databaseExp;
    private int camunda;
    private int health;
    private String comment;

    @Override
    public String toString() {
        return "UserCandidate{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telephone='" + telephone + '\'' +
                ", frontend=" + frontend +
                ", backend=" + backend +
                ", database=" + databaseExp +
                ", camunda=" + camunda +
                ", health=" + health +
                ", comment='" + comment + '\'' +
                '}';
    }
}


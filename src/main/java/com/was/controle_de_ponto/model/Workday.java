package com.was.controle_de_ponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Workday {
    @Id
    @GeneratedValue
    private long id;
    private String description;
}

//Foi usado o Lombok para simplificar a criação de get e Set e as anotações para a classe.
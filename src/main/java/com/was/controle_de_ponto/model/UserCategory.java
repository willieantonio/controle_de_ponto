package com.was.controle_de_ponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class UserCategory {
    @Id
    private long id;
    private String description;
}

//Usado a dependencia do Lombok para simplificar o código
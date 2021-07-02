package com.was.controle_de_ponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BankHours {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class BankHoursId implements Serializable{
        private long idBankHours;
        private long idMovement;
        private long idUser;
    }

    @EmbeddedId
    private BankHoursId bankHoursId;
    private LocalDateTime dateWorked;
    private BigDecimal quantityHours;
    private BigDecimal balanceHours;
}

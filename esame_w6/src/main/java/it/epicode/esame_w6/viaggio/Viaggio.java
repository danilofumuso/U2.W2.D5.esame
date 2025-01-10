package it.epicode.esame_w6.viaggio;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Viaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String destinazione;

    @Column(nullable = false)
    private LocalDate data;

    @Column(name="stato_viaggio",nullable = false)
    @Enumerated(EnumType.STRING)
    private StatoViaggio statoViaggio;

}

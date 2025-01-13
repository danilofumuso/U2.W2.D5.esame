package it.epicode.esame_w6.dipendente;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

@Data
@Entity
@Table(name = "dipendenti")
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;

    private String nome;

    private String cognome;

    private String email;

    @Column(name="url_foto_profilo")
    private String urlFotoProfilo;

}

package it.epicode.esame_w6.dipendente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DipendenteDTO {

    @NotBlank(message = "Il campo username non può essere vuoto!")
    private String username;

    @NotBlank(message = "Il campo nome non può essere vuoto!")
    private String nome;

    @NotBlank(message = "Il campo cognome non può essere vuoto!")
    private String cognome;

    @Email(message = "Inserisci un indirizzo email valido!")
    private String email;

}

package it.epicode.esame_w6.prenotazione;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PrenotazioneDTO {

    private LocalDate dataPrenotazione;

    private String preferenzeDipendente;

    private Long viaggioId;

    private Long dipendenteId;


}

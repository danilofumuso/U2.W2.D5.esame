package it.epicode.esame_w6.prenotazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService;

    @GetMapping
    public ResponseEntity<List<Prenotazione>> getAllPrenotazioni(){

        List<Prenotazione> prenotazioni = prenotazioneService.findAll();

        return ResponseEntity.ok(prenotazioni);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prenotazione> findPrenotazioneById(@PathVariable Long id){
        return ResponseEntity.ok(prenotazioneService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Prenotazione> createPrenotazione(@RequestBody PrenotazioneDTO prenotazioniDTO) {
        return new ResponseEntity<>(prenotazioneService.createPrenotazione(prenotazioniDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prenotazione> updatePrenotazione(@PathVariable Long id, @RequestBody PrenotazioneDTO modifiedPrenotazione) {
        return ResponseEntity.ok(prenotazioneService.updatePrenotazione(id, modifiedPrenotazione));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePrenotazione(@PathVariable Long id) {
        prenotazioneService.deletePrenotazione(id);
        return new ResponseEntity<>("Prenotazione eliminata correttamente!",HttpStatus.NO_CONTENT);
    }

}

package it.epicode.esame_w6.dipendente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping
    public ResponseEntity<List<Dipendente>> getAllDipendenti(){

        List<Dipendente> dipendenti = dipendenteService.findAll();

        return ResponseEntity.ok(dipendenti);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dipendente> findDipendenteById(@PathVariable Long id){
        return ResponseEntity.ok(dipendenteService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Dipendente> createDipendente(@RequestBody Dipendente dipendente) {
        return new ResponseEntity<>(dipendenteService.createDipendente(dipendente), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dipendente> updateDipendente(@PathVariable Long id, @RequestBody Dipendente modifiedDipendente) {
        return ResponseEntity.ok(dipendenteService.updateDipendente(id, modifiedDipendente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDipendente(@PathVariable Long id) {
        dipendenteService.deleteDipendente(id);
        return new ResponseEntity<>("Dipendente eliminato correttamente!",HttpStatus.NO_CONTENT);
    }

}

package br.itb.com.educai.control;

import br.itb.com.educai.model.Laudo;
import br.itb.com.educai.service.LaudoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@CrossOrigin (origins="*", maxAge = 3600, allowCredentials = "false")
@RequestMapping("/laudo")
public class LaudoController {

    final LaudoService laudoService;

    public LaudoController(LaudoService _laudoService) {
        this.laudoService = _laudoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveLaudo(@RequestBody Laudo laudo){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(laudoService.save(laudo));
    }

    @GetMapping
    public ResponseEntity<List<Laudo>> getAllLaudos(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(laudoService.findAll());
    }

    @PutMapping
    public ResponseEntity<Object> updateProduto(@RequestBody Laudo laudo){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(laudoService.update(laudo));
    }

    @DeleteMapping
    public ResponseEntity<Object> deleteProduto(@RequestBody Laudo laudo){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(laudoService.delete(laudo));
    }

}

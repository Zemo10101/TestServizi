package it.ds.Test.Controllers;

import it.ds.Test.Interfaccia.optionInterfaccia;
import it.ds.Test.models.modello;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OptionController {

    private final List<optionInterfaccia> servizi;

    @PostMapping("/calcolo")
    public ResponseEntity<Integer> calcolo(@RequestBody modello m) {

        for(optionInterfaccia op : servizi) {
            if(op.getName().equals(m.getChiave())) {
                int r = op.elabora(m.getA(),m.getB(),m.getC());
                return ResponseEntity.ok().body(r);
            }
        }
        return ResponseEntity.ok().body(0);
    }
}

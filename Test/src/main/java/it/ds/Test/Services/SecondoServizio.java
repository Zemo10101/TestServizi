package it.ds.Test.Services;

import it.ds.Test.Interfaccia.optionInterfaccia;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class SecondoServizio implements optionInterfaccia {

    private String NAME = "secondoServizio";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int elabora(int a, int b, int c) {
        return a-b-c;
    }
}

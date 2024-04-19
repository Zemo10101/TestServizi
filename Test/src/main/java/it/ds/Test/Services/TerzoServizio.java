package it.ds.Test.Services;

import it.ds.Test.Interfaccia.optionInterfaccia;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TerzoServizio implements optionInterfaccia {

    private String name = "terzoServizio";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int elabora(int a, int b, int c) {
        return a*b*c;
    }
}

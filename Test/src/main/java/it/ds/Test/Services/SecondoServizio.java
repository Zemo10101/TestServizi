package it.ds.Test.Services;

import it.ds.Test.Interfaccia.optionInterfaccia;

public class SecondoServizio implements optionInterfaccia {

    private final String NAME="secondoServizio";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int elabora(int a, int b, int c) {
        return a-b-c;
    }
}

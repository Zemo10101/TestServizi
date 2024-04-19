package it.ds.Test.Services;

import it.ds.Test.Interfaccia.optionInterfaccia;

public class PrimoServizio implements optionInterfaccia {

    private final String NAME="primoServizio";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int elabora(int a, int b, int c) {
        return a+b+c;
    }
}

package it.ds.Test.Services;

import it.ds.Test.Interfaccia.optionInterfaccia;

public class PrimoServizio implements optionInterfaccia {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int elabora(int a, int b, int c) {
        return a+b+c;
    }
}

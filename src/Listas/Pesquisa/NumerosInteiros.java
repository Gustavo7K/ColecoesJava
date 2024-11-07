package Listas.Pesquisa;

import java.util.List;

public class NumerosInteiros {
    private int numeros;

    public NumerosInteiros(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "Numeros Inteiros = " + numeros;
    }
}

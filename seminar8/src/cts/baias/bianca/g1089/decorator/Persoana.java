package cts.baias.bianca.g1089.decorator;

public class Persoana {
    private String gen;

    public Persoana(String gen) {
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "gen='" + gen + '\'' +
                '}';
    }
}

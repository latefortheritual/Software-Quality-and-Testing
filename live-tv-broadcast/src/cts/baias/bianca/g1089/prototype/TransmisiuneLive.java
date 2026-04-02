package cts.baias.bianca.g1089.prototype;

import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements Live {
    private String titlu;
    private String platforma;
    private List<String> comentarii = new ArrayList<>();

    public TransmisiuneLive(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public void adaugaComentariu(String comentariu) {
        comentarii.add(comentariu);
    }

    @Override
    public List<String> getComentarii() { return comentarii; }

    @Override
    public void setPlatforma(String platforma) { this.platforma = platforma; }

    @Override
    public Live clone() {
        try {
            TransmisiuneLive clone = (TransmisiuneLive) super.clone();
            clone.comentarii = new ArrayList<>();
            clone.comentarii.addAll(comentarii);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "TransmisiuneLive{" +
                "titlu='" + titlu + '\'' +
                ", platforma='" + platforma + '\'' +
                ", comentarii=" + comentarii +
                '}';
    }
}
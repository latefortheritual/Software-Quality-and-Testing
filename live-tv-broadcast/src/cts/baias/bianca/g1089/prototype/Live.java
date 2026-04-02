package cts.baias.bianca.g1089.prototype;

import java.util.List;

public interface Live extends Cloneable{
    void adaugaComentariu(String comentariu);
    List<String> getComentarii();
    void setPlatforma(String platforma);
    Live clone();
}

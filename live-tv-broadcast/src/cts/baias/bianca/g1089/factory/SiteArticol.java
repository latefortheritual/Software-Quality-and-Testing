package cts.baias.bianca.g1089.factory;

public class SiteArticol implements NewsArticle {
    private String categorie, titlu, text;

    public SiteArticol(String categorie, String titlu, String text) {
        this.categorie = categorie;
        this.titlu = titlu;
        this.text = text;
    }


    @Override
    public void display() {
        System.out.println("[" + categorie.toUpperCase() + " - SITE] " + titlu + "\n" + text);
    }
}

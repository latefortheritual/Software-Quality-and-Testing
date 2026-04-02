package cts.baias.bianca.g1089.factory;

public class SMArticol implements NewsArticle {
    private String categorie, titlu, text, link;

    public SMArticol(String categorie, String titlu, String text, String link) {
        this.categorie = categorie;
        this.titlu = titlu;
        this.text = text.length() > 100 ? text.substring(0, 100) : text;
        this.link = link;
    }

    @Override
    public void display() {
        System.out.println("[" + categorie.toUpperCase() + " - SM] " + titlu + "\n" + text + "\nLink: " + link);
    }
}

package cts.baias.bianca.g1089.factory;

public class PoliticaFactory implements INewsFactory {
    @Override
    public NewsArticle createSite(String titlu, String text) {
        return new SiteArticol("Politica", titlu, text);
    }

    @Override
    public NewsArticle createSM(String titlu, String text, String link) {
        return new SMArticol("Politica", titlu, text, link);
    }
}

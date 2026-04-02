package cts.baias.bianca.g1089.factory;

public class EconomieFactory implements INewsFactory {

    @Override
    public NewsArticle createSite(String titlu, String text) {
        return new SiteArticol("Economie", titlu, text);
    }


    @Override
    public NewsArticle createSM(String titlu, String text, String link) {
        return new SMArticol("Economie", titlu, text, link);
    }
}
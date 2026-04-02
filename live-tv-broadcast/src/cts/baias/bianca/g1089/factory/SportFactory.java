package cts.baias.bianca.g1089.factory;

public class SportFactory implements INewsFactory {
    @Override
    public NewsArticle createSite(String titlu, String text) {
        return new SiteArticol("Sport", titlu, text);
    }

    @Override
    public NewsArticle createSM(String titlu, String text, String link) {
        return new SMArticol("Sport", titlu, text, link);
    }
}

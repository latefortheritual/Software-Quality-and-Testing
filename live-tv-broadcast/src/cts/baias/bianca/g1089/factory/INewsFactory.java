package cts.baias.bianca.g1089.factory;

public interface INewsFactory {
    NewsArticle createSite(String titlu, String text);
    NewsArticle createSM(String titlu, String text, String link);
}

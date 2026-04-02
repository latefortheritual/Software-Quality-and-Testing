package cts.baias.bianca.g1089.main;

import cts.baias.bianca.g1089.factory.*;
import cts.baias.bianca.g1089.prototype.*;
import java.util.Scanner;

public class Main {

    static INewsFactory getFactory(String categorie) {
        return switch (categorie.toLowerCase()) {
            case "economie" -> new EconomieFactory();
            case "politica" -> new PoliticaFactory();
            case "sport"    -> new SportFactory();
            default -> throw new IllegalArgumentException("Categorie invalida");
        };
    }

    public static void main(String[] args) {

        TransmisiuneLive prototip = new TransmisiuneLive("Alegeri 2024");

        TransmisiuneLive youtube  = (TransmisiuneLive) prototip.clone();
        youtube.setPlatforma("YouTube");

        TransmisiuneLive facebook = (TransmisiuneLive) prototip.clone();
        facebook.setPlatforma("Facebook");

        TransmisiuneLive tiktok   = (TransmisiuneLive) prototip.clone();
        tiktok.setPlatforma("TikTok");

        youtube.adaugaComentariu("comentariu youtube");
        facebook.adaugaComentariu("comentariu facebook");

        System.out.println(youtube);
        System.out.println(facebook);
        System.out.println(tiktok);

        //factory
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Stire " + (i + 1) + " ---");
            System.out.print("Categorie (economie/politica/sport): ");
            String categorie = scanner.nextLine();

            System.out.print("Titlu: ");
            String titlu = scanner.nextLine();

            System.out.print("Text: ");
            String text = scanner.nextLine();

            System.out.print("Link: ");
            String link = scanner.nextLine();

            INewsFactory factory = getFactory(categorie);
            factory.createSite(titlu, text).display();
            factory.createSM(titlu, text, link).display();
        }

        scanner.close();
    }
}
package cts.baias.bianca.g1089.prototype;

import cts.baias.bianca.g1089.factory.Sport;

import java.util.ArrayList;
import java.util.List;

public class Transmission implements Live{
    private List<String> comments = new ArrayList<>();
    private String streamingService;
    private Sport sport;

    public Transmission(Sport sport) {
        this.sport = sport;
        System.out.println("Creating transmission...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Transmission created");
    }

    @Override
    public String getStreamingService() {
        return streamingService;
    }

    @Override
    public void setStreamingService(String streamingService) {
        this.streamingService = streamingService;
    }


    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public void seeComments() {
        for (String comment : comments) {
            System.out.println(comment);
        }
    }

    @Override
    public Live clone() {
        try {
            Transmission clone = (Transmission) super.clone();

            clone.comments = new ArrayList<>();
            clone.comments.addAll(comments);

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "comments=" + comments +
                ", streamingService='" + streamingService + '\'' +
                ", sport=" + sport +
                '}';
    }
}

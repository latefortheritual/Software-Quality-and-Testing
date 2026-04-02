package cts.baias.bianca.g1089.prototype;

public interface Live extends Cloneable{
    Live clone();
    void addComment(String comment);
    void seeComments();

    void setStreamingService(String streamingService);
    String getStreamingService();
}

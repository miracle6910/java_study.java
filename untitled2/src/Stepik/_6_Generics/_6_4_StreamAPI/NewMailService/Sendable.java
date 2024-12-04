package Stepik._6_Generics._6_4_StreamAPI.NewMailService;

public interface Sendable<T> {
    String getTo();
    T getContent();
}

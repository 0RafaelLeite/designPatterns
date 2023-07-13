package designPatterns.chainOfResponsability.components;

public interface MyHandler {
    void setNextHandler(MyHandler handler);
    void handleRequest(int request);
}

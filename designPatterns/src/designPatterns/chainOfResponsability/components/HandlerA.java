package designPatterns.chainOfResponsability.components;

public class HandlerA extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("HandlerA handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}

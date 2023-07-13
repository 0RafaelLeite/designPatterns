package designPatterns.chainOfResponsability.components;

public class HandlerB extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request < 20) {
            System.out.println("HandlerB handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}

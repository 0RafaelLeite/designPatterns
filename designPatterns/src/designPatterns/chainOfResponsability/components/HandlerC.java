package designPatterns.chainOfResponsability.components;

public class HandlerC extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request < 30) {
            System.out.println("HandlerC handled the request.");
        } else {
            System.out.println("No handler could handle the request.");
        }
    }
}

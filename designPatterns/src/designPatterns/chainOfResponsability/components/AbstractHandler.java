package designPatterns.chainOfResponsability.components;

abstract class AbstractHandler implements MyHandler {
    protected MyHandler nextHandler;
    @Override
    public void setNextHandler(MyHandler handler) {
        this.nextHandler = handler;
    }
    @Override
    public void handleRequest(int request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

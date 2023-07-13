package designPatterns.chainOfResponsability;

import designPatterns.chainOfResponsability.components.*;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        MyHandler handlerA = new HandlerA();
        MyHandler handlerB = new HandlerB();
        MyHandler handlerC = new HandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handleRequest(5);
    }
}

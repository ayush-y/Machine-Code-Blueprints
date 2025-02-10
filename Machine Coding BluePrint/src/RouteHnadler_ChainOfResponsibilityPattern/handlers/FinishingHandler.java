package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public class FinishingHandler implements RequestHandler {
    @Override
    public void handle(Request request) {
        System.out.println("Finishing the request");
    }

}

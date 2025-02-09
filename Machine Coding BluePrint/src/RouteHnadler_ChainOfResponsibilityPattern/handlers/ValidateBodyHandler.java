package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public class ValidateBodyHandler implements RequestHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("ValidateBodyHandler");
    }
}

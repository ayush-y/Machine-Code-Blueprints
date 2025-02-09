package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public class AuthenticationHandler implements RequestHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("AuthenticationHandler: Authenticating the request");
    }

}

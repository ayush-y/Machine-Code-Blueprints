package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public class AuthorizationHandler implements RequestHandler {
        private final RequestHandler nextHandler;
        public AuthorizationHandler(RequestHandler nextHandler) {
            this.nextHandler = nextHandler;
        }
    @Override
    public void handle(Request request) {
        System.out.println("AuthorizationHandler");
        this.nextHandler.handle(request);
    }
}

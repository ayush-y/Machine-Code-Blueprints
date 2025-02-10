package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public class ValidateBodyHandler implements RequestHandler {
    private final RequestHandler nextHandler;
    public ValidateBodyHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        //Above the next handler call, whatever is written is executed before the next handler is called
        System.out.println("ValidateBodyHandler");
        this.nextHandler.handle(request);
        //Below the next handler call, whatever is written is executed after the next handler is called
    }
}

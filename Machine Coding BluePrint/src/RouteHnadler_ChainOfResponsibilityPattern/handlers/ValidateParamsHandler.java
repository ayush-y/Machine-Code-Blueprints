package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public class ValidateParamsHandler implements RequestHandler {
    private final RequestHandler nextHandler;
    public ValidateParamsHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        System.out.println("ValidateParamsHandler");
        this.nextHandler.handle(request);
    }
}

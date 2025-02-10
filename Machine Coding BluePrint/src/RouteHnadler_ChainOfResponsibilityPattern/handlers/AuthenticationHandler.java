package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;
import RouteHnadler_ChainOfResponsibilityPattern.services.TokenService;

public class AuthenticationHandler implements RequestHandler {
    private final RequestHandler nextHandler;
    private TokenService tokenService;
    public AuthenticationHandler(RequestHandler nextHandler, TokenService tokenService) {
        this.nextHandler = nextHandler;
        this.tokenService = tokenService;
    }

    @Override
    public void handle(Request request) {
        this.tokenService.validateToken(request);
        this.nextHandler.handle(request);
    }


}

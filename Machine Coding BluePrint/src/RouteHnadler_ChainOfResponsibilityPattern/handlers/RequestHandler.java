package RouteHnadler_ChainOfResponsibilityPattern.handlers;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public interface RequestHandler {
    void handle(Request request);//what to do in handler goes here
}

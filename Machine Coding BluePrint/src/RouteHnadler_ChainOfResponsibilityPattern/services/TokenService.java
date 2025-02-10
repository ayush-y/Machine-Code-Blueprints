package RouteHnadler_ChainOfResponsibilityPattern.services;


import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public interface TokenService {
    boolean validateToken(Request request);

}

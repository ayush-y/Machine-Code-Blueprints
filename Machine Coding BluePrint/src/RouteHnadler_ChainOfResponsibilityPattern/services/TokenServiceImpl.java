package RouteHnadler_ChainOfResponsibilityPattern.services;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;

public class TokenServiceImpl implements TokenService {
    @Override
    public boolean validateToken(Request request) {
        System.out.println("TokenService: Validating token");
        // fetch token from  header
        //validate token from key
        //If token is invalid return notAuthenticated
        //If token is valid return true

        return true;
    }
}

package RouteHnadler_ChainOfResponsibilityPattern.factory;

import RouteHnadler_ChainOfResponsibilityPattern.handlers.*;
import RouteHnadler_ChainOfResponsibilityPattern.services.TokenService;
import RouteHnadler_ChainOfResponsibilityPattern.services.TokenServiceImpl;

public class RequestHandlerFactory {
    public static RequestHandler getHandlerForCreateTODO() {
        return new ValidateBodyHandler(
                new AuthorizationHandler(
                        new AuthenticationHandler(
                                new FinishingHandler(), new TokenServiceImpl() {
                        }
                        )
                )
        );
    }
    public static RequestHandler getHandlerForGetTODO() {
        return new ValidateBodyHandler(
                new AuthorizationHandler(
                new AuthenticationHandler(
                        new FinishingHandler(), new TokenServiceImpl() {
                }
                )
                )
        );
    }
}

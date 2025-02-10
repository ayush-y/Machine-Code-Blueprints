package RouteHnadler_ChainOfResponsibilityPattern.Controller;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;
import RouteHnadler_ChainOfResponsibilityPattern.factory.RequestHandlerFactory;
import RouteHnadler_ChainOfResponsibilityPattern.handlers.*;
import RouteHnadler_ChainOfResponsibilityPattern.schema.Todo;

import java.util.Arrays;
import java.util.List;

public class TodoController {

    private Todo createTodo(Request request) {
        RequestHandlerFactory.getHandlerForCreateTODO().handle(request);
        //Execute initial handlers to create a Todo object
        //Return a new Todo object
        return new Todo();
    }
}

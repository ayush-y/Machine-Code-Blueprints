package RouteHnadler_ChainOfResponsibilityPattern.Controller;

import RouteHnadler_ChainOfResponsibilityPattern.DTO.Request;
import RouteHnadler_ChainOfResponsibilityPattern.schema.Todo;

public class TodoController {
    private Todo createTodo(Request request) {
        //Execute initial handlers to create a Todo object
        return new Todo();
    }
}

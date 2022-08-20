package com.company.ChainOfResponsibility;

public class LoggingRequestHandler extends RequestHandler{
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로그 남김");
        super.handle(request);
    }
}

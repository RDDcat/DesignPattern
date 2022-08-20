package com.company.ChainOfResponsibility;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler){
        this.requestHandler = requestHandler;
    }

    public void exec(){
        Request request = new Request("클라이언트 요청");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.exec();
    }
}

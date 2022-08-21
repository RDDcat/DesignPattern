package com.company.Proxy;

public class Client {

    public static void main(String[] args) {
        Server server = new ProxyServer();
        server.exec();
    }
}

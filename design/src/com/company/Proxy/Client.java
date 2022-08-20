package com.company.Proxy;

public class Client {

    public static void main(String[] args) {
        Server server = new ProxyServer(new GameServer());
        server.exec();
    }
}

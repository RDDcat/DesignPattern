package com.company.Proxy;

public class ProxyServer implements Server {

    private Server server;

    public ProxyServer(){
        if(server == null){
            this.server = new GameServer();
        }

    }

    @Override
    public void exec() {
        // 부가적인 일
        System.out.println("프록시서버 시작");
        long before = System.currentTimeMillis();
        server.exec();
        System.out.println(System.currentTimeMillis()-before);
    }
}

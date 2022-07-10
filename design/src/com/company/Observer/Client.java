package com.company.Observer;

public class Client {
    public static void main(String[] args) {
        Server Server = new Server();
        User user1 = new User("user1");
        User user2 = new User("user2");

        Server.register("디자인패턴", user1);
        Server.register("디자인패턴", user2);

        Server.register("롤체", user1);

        Server.sendMessage(user1, "디자인패턴", "오늘의 패턴은 옵저버입니다");
        Server.sendMessage(user2, "롤체", "다이아에서 못나오는중");
        Server.sendMessage(user1, "디자인패턴", "냐옹이다옹");

        Server.unregister("디자인패턴", user2);

        Server.sendMessage(user2, "디자인패턴", "옵저버 패턴 장단점 보는 중");
    }
/*  출력
    user1 user1: 오늘의 패턴은 옵저버입니다
    user2 user1: 오늘의 패턴은 옵저버입니다
    user1 user2: 다이아에서 못나오는중
    user1 user1: 냐옹이다옹
    user2 user1: 냐옹이다옹
    user1 user2: 옵저버 패턴 장단점 보는 중*/
}

package com.company.Observer;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 옵저버 등록 및 해지
public class Server {
    private Map<Object, List<Subscriber>> subscribers = new HashMap<>();

    // 등록
    public void register(String subject, Subscriber subscriber){
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
        }
    }

    public void unregister(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message) {
        if (this.subscribers.containsKey(subject)) {
            String userMessage = user.getName() + ": " + message;
            this.subscribers.get(subject).forEach(s -> s.handle(userMessage));
        }
    }
}

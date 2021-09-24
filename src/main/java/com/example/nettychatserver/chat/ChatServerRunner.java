package com.example.nettychatserver.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChatServerRunner implements CommandLineRunner {

    private final ChatServer chatServer;

    @Override
    public void run(String... args) throws Exception {
        chatServer.run();
    }
}

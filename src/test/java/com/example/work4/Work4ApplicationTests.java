package com.example.work4;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class Work4ApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        UUID uuid = UUID.fromString("2c5a0889-f677-41b2-824a-9653fa6bcfca");
        String str = "2c5a0889-f677-41b2-824a-9653fa6bcfca";
        System.out.println(uuid.toString().equals(str));
    }
}
